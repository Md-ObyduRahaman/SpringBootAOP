package com.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student st = context.getBean("student", Student.class);
		st.study();
	}
}
