package com.av.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.av.MyConfig;
import com.av.dto.Employee;

public class TestEmployee {

	public static void main(String[] args) {
	
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Employee e =(Employee) applicationContext.getBean("emp");
		e.display();
		
	}

}
