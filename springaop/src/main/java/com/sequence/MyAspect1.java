package com.sequence;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class MyAspect1 {

	/*
	 * @Before("execution(* *(..))") public void advice() {
	 * System.out.println("Advice-- MyAspect1"); }
	 */
	@Before("execution(* *(..))")
	public void abc() {
		System.out.println("abc-- MyAspect1");
	}

	@Before("execution(* *(..))")
	public void xyz() {
		System.out.println("xyz-- MyAspect1");
	}
}
