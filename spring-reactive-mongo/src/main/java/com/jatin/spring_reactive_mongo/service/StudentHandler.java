package com.jatin.spring_reactive_mongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.jatin.spring_reactive_mongo.model.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * StudentHandler
 */
@Component
public class StudentHandler {

	@Autowired
    private StudentService studentService;

    public Mono<ServerResponse> getAllStudents(ServerRequest request) {
        Flux<Student> students = studentService.getAllStudents();
        return ServerResponse.ok().body(students, Student.class);
    }

    public Mono<ServerResponse> getStudentById(ServerRequest request) {
        String id = request.pathVariable("id");
        Mono<Student> student = studentService.getStudentById(id);
        return student.flatMap(stu -> ServerResponse.ok().bodyValue(stu))
                      .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> createStudent(ServerRequest request) {
        Mono<Student> studentMono = request.bodyToMono(Student.class);
        return studentMono.flatMap(studentService::createStudent)
                          .flatMap(student -> ServerResponse.ok().bodyValue(student));
    }

    public Mono<ServerResponse> updateStudent(ServerRequest request) {
        String id = request.pathVariable("id");
        Mono<Student> studentMono = request.bodyToMono(Student.class);
        return studentMono.flatMap(student -> studentService.updateStudent(id, student))
                          .flatMap(updatedStudent -> ServerResponse.ok().bodyValue(updatedStudent))
                          .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> deleteStudent(ServerRequest request) {
        String id = request.pathVariable("id");
        return studentService.deleteStudent(id)
                             .flatMap(result -> ServerResponse.ok().build())
                             .switchIfEmpty(ServerResponse.notFound().build());
    }
}
