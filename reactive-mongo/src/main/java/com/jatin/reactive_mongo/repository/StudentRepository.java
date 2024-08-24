package com.jatin.reactive_mongo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.jatin.reactive_mongo.model.Student;

import reactor.core.publisher.Flux;

/**
 * StudentRepository
 */
@Repository
public interface StudentRepository extends ReactiveMongoRepository<Student, String> {

	Flux<Student> findByName(String name);
}
