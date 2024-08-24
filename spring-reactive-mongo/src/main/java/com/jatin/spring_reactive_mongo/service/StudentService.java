package com.jatin.spring_reactive_mongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jatin.spring_reactive_mongo.model.Student;
import com.jatin.spring_reactive_mongo.repository.StudentRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * StudentService
 */
@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Flux<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Mono<Student> getStudentById(String id) {
		return studentRepository.findById(id);
	}

	public Mono<Student> createStudent(Student student) {
		return studentRepository.save(student);
	}

	public Mono<Student> updateStudent(String id, Student student) {
		return studentRepository.findById(id)
				.flatMap(existingStudent -> {
					existingStudent.setName(student.getName());
					existingStudent.setAge(student.getAge());
					existingStudent.setAge(student.getAge());
					existingStudent.setEmail(student.getEmail());
					return studentRepository.save(existingStudent);
				});
	}

	public Mono<Void> deleteStudent(String id) {
		return studentRepository.deleteById(id);
	}
}
