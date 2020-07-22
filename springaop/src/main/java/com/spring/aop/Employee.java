package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	// @After("execution(public void com.spring.aop.Student.study())")
	public void studySomething() {

		System.out.println("i am exploring ");
	}
}
