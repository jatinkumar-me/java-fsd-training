package com.jatin.my_app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jatin.my_app.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	private static BeanFactory factory;

	public static void main(String[] args) {
		
		factory = new ClassPathXmlApplicationContext("Beans.xml");

		Employee e1 = (Employee) factory.getBean("empbean");
		Employee e2 = (Employee) factory.getBean("emp2");
		Employee e3 = (Employee) factory.getBean("emp3");
		Employee e4 = (Employee) factory.getBean("emp4");
		Employee e5 = (Employee) factory.getBean("emp5");

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
	}
}
