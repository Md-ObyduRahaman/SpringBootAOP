package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Student {

	public int studyAnything(int x, int y) {
		System.out.println("i am in school and studying right now !");
		return 500;
	}

}
