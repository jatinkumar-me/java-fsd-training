package com.jatin.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ang")
public class WelcomeController {

	public static final String template = "Hello, %s!!!";

	@GetMapping
	public String welcome() {
		String str = "hello world";
		return str;
	}

	// @GetMapping
	// public String welcome2() {
	// 	return "This is string boot";
	// }
	//
	@GetMapping("/greet")
	public String greet(@RequestParam(value = "name",defaultValue = " World") String name) {
		return String.format(template, name);
	}
}
