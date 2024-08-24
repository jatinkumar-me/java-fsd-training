package com.jatin.reactive_mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jatin.reactive_mongo.model.Student;
import com.jatin.reactive_mongo.service.StudentService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * StudentController
 */
@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping
	public Flux<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/{id}")
	public Mono<Student> getStudentById(@PathVariable String id) {
		return studentService.getStudentById(id);
	}

	@PostMapping
	public Mono<Student> createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@PutMapping("/{id}")
	public Mono<Student> updateStudent(@PathVariable String id, @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}

	@DeleteMapping("/{id}")
	public Mono<Void> deleteStudent(@PathVariable String id) {
		return studentService.deleteStudent(id);
	}
}
