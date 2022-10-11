package com.av.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.av.dto.Student;

public class JeeContainer {

	public static void main(String[] args) {
		
		ApplicationContext aContext=new ClassPathXmlApplicationContext("myspring.xml");
		
		Student p=(Student) aContext.getBean("stu");
		p.display();
		
	}

}
