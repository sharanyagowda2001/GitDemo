package com.av.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.av.aa.MyConfig;
import com.av.dto.Person;

public class TestPerson {

	public static void main(String[] args) {
			
			ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
			Person p =(Person) applicationContext.getBean("person");
			p.details();
		
	}

}


