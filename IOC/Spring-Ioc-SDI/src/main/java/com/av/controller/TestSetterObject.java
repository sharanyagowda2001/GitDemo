package com.av.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.av.dto.Car;
import com.av.dto.Teacher;

public class TestSetterObject {
	
	public static void main(String[] args) {
			
			ApplicationContext aContext=new ClassPathXmlApplicationContext("myobject.xml");
			
			Car car=(Car) aContext.getBean("car");
			
	
		}
}
