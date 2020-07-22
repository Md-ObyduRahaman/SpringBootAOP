package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class Human {

	@Before("execution(public void study())")
	// @After("execution(public void study())")
	public void wekeUp() {
		System.out.println("Good morning");
	}
}
