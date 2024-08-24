package com.jatin.webflux_reactive;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class WebfluxReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxReactiveApplication.class, args);

		// Mono<Integer> monoInt = Mono.just(12);
		// monoInt.subscribe(System.out::println);
		//

		Flux<Integer> fluxInt = Flux.just(1, 2, 3, 4, 5, 7).delayElements(Duration.ofSeconds(2));

		fluxInt.subscribe(System.out::println);
	}

}
