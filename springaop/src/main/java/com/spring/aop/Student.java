package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Student {

	public int studyAnything(int x, int y) {
		System.out.println("i am in school and studying right now !");
		return 500;
	}

	public int doOperation() {
		throw new MyExeption("this is my exception..!");

	}

	public int rankOfVideo(int noOfViews, int watchtime) {
		System.out.println("This is rank method" + noOfViews + " ....." + watchtime);
		return (noOfViews * watchtime) - (noOfViews + watchtime);
	}

}
