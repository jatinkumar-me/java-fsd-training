package com.jatin.spring_reactive_mongo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;

import com.jatin.spring_reactive_mongo.model.Student;

import reactor.core.publisher.Flux;

/**
 * StudentRepository
 */
@Repository
@EnableReactiveMongoRepositories
public interface StudentRepository extends ReactiveMongoRepository<Student, String> {

	Flux<Student> findByName(String name);
}
