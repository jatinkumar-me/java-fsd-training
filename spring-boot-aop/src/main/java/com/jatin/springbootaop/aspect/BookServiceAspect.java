package com.jatin.springbootaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookServiceAspect {

	@Before(value = "execution(* com.jatin.springbootaop.service.BookService.*(..)) and args(title,bookid)")
	public void beforeAdvice(JoinPoint joinpoint, String title, String bookid) {
		System.out.println("Before method :" + joinpoint.getSignature());
		System.out.println("Creating a book :" + title + " " + bookid);
	}
}
