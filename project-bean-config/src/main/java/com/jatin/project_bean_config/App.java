package com.jatin.project_bean_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.jatin.project_bean_config.model.MyMessage;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyMessage.class);
		
		MyMessage msg1 = context.getBean(MyMessage.class);
		
		msg1.setMessage("Welcome to the world of spring beans");
		
		System.out.println(msg1.getMessage());
		
		((AbstractApplicationContext) context).close();
	}
}