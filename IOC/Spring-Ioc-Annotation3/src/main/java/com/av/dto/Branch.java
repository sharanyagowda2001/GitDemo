package com.av.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "bran")
public class Branch {

	public Address ad;
//
//	@Autowired
//	public void setA(Address ad) {
//		this.ad = ad;
//	}
//	

	public Branch(@Autowired Address ad) {
		
		super();
		this.ad = ad;
	}
	
	
	
	
}
