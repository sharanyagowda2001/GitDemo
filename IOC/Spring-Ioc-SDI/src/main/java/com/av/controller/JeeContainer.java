package com.av.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.av.dto.Teacher;

public class JeeContainer {

	public static void main(String[] args) {
		
		ApplicationContext aContext=new ClassPathXmlApplicationContext("myspring.xml");
		
		Teacher p=(Teacher) aContext.getBean("teacher");
		p.display();

	}

}
