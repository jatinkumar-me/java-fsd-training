package com.jatin.reactive_mono;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class ReactiveMonoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveMonoApplication.class, args);

		Mono<String> myMonogString = Mono.just("this is first mono variable");
		System.out.println("Before subscribing monog");

		myMonogString.subscribe(System.out::println);

		Flux<String> myFluxString = Flux.just("One", "Two", "three", "Four");
		System.out.println("Before subscribing Flux");

		myFluxString.subscribe(System.out::println);

		String[] cities = new String[] { "Delhi", "Agra", "mumbai", "pune" };

		Flux<String> myFluxCities = Flux.fromArray(cities).delayElements(Duration.ofSeconds(2));

		myFluxCities.subscribe(System.out::println);

	}

}
