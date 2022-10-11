package com.av;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class J2EEContainer2 {

	public static void main(String[] args) {
		
		ApplicationContext aContext=new ClassPathXmlApplicationContext("myspring2.xml");
		Student p=(Student) aContext.getBean("stu");
		p.displayStudent();
		
	}

}
