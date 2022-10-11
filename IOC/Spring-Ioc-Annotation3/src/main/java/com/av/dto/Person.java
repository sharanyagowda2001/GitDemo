package com.av.dto;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired
	
	Adhar a;
	
	public void details() {
	
		System.out.println("Raju");
		a.number();
		
	}
	
	
	
}
