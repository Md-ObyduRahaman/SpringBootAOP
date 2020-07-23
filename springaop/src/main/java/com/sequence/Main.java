package com.sequence;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.aop.AppConfig;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Operation bean = context.getBean(Operation.class);
		bean.sum(45, 5);
	}

}
