package com.jatin.spring_mvc.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
	
	public String hello() {
		return "index";
	}
}
