package com.jatin.project_bean_config.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyMessageConfig {

	@Bean
	public MyMessage myMessage() {
		return new MyMessage();
	}
}
