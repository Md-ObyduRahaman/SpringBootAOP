package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class Human {

	// @Before("execution(public void study())")
	// @After("execution(public void study())") // cross cutting consurn
	// @After("execution(public void com.spring.aop.Employee.study())")
//	@After("execution(public void study*())") // wildcard
	@After("execution(public * study*())") // wildcard
	public void wekeUp() {
		System.out.println("Good morning");// its not a simple method its a advice
	}
}
