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
		Employee employee = context.getBean("employee", Employee.class);
		// join point(before)
		st.studyAnything();
		// join point(after)

		// join point(before)
		employee.studySomething();
		// join point(before)
	}
}
