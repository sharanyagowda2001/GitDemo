package com.av;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class J2EEContainer {

	public static void main(String[] args) {
		
		ApplicationContext aContext=new ClassPathXmlApplicationContext("myspring.xml");
		Pencil p=(Pencil) aContext.getBean("Pencil");
		p.display();
		
	}

}
