package com.jatin.spring_reactive.component;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

/**
 * WelcomeHandler
 */
@Component
public class WelcomeHandler {

	public Mono<ServerResponse> welcomeAll(ServerRequest request) {

		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).body(BodyInserters.fromValue("Welcome Everyone"));
	}
}