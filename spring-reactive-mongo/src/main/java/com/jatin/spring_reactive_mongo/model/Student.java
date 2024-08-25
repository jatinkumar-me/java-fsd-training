package com.jatin.spring_reactive_mongo.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Student
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	private String id;
	private String name;
	private String  email;
	private int age;
}
