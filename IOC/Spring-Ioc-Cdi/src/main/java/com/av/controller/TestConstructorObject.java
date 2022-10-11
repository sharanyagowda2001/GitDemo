package com.av.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.av.dto.Car;

public class TestConstructorObject {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myobject.xml");
		Car car=(Car) applicationContext.getBean("car");
		car.playMusic.play();

	}
	
	
}
