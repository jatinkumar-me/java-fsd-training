package com.jatin.spring_reactive_mongo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class StudentRouter {

	@Bean
	public RouterFunction<ServerResponse> studentRoutes(StudentHandler studentHandler) {
		return route(GET("/students"), studentHandler::getAllStudents)
				.andRoute(GET("/students/{id}"), studentHandler::getStudentById)
				.andRoute(POST("/students"), studentHandler::createStudent)
				.andRoute(PUT("/students/{id}"), studentHandler::updateStudent)
				.andRoute(DELETE("/students/{id}"), studentHandler::deleteStudent);
	}
}
