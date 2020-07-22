package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class Human {

	// @Before("execution(public void study())")-->called point cut expression
	// @After("execution(public void study())") // cross cutting consurn
	// @After("execution(public void com.spring.aop.Employee.study())")
//	@After("execution(public void study*())") // wildcard
	// @Before("execution(public * study*())") // wildcard(its optional for point
	// cut)
	@Before("myPointCut()") // wildcard
	public void wekeUp(JoinPoint j) {
		// System.out.println("Good morning " + j.getSignature().getName());// its not a
		// simple
		// method its a advice
		// System.out.println("Good morning " + j.getArgs()[0]);// its not a simple
		// method its a advice
		// System.out.println("Good morning " + j.getTarget().getClass().getName());
		System.out.println("Good morning " + j.getThis().getClass().getName());
	}

	// @After("execution(public * study*())") // wildcard(its optional for point
	// cut)
	@After("myPointCut()") // wildcard
	public void sleep() {
		System.out.println("Good morning");// its not a simple method its a advice
	}

	// @Pointcut("execution(public * study*())") // wildcard
	@Pointcut("execution(public * studyAnything(int,int))")
	public void myPointCut() {
	}
}
