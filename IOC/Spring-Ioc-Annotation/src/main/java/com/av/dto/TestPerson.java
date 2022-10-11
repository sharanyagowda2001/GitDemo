package com.av.dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		
		ApplicationContext aContext=new ClassPathXmlApplicationContext("myspring.xml");
		Person p=(Person) aContext.getBean("person");
		p.savePerson(1, "Sharanya", 20);
		p.getPerson();
		
	}

}
