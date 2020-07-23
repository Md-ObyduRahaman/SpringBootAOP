package com.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// -->https://howtodoinjava.com/spring-aop/aspectj-pointcut-expressions/

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student st = context.getBean("student", Student.class);
		Employee employee = context.getBean("employee", Employee.class);
		// join point(before)
		int studyAnything = st.studyAnything(5, 5);
		System.out.println("Return value :" + studyAnything);
		// join point(after)

		// join point(before)
		// employee.studySomething();
		// join point(before)
	}
}
