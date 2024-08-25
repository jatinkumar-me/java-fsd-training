package com.jatin.spring_reactive.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * WelcomeRouter
 */
@Configuration
public class WelcomeRouter {

	@Bean
	public RouterFunction<ServerResponse> getWelcomeRouter(WelcomeHandler welcomeHandler) {

		return RouterFunctions.route(RequestPredicates.GET("/welcome")
				.and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), welcomeHandler::welcomeAll);
	}
}
