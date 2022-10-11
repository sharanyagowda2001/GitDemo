package com.av.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.av.aa.MyConfig;
import com.av.dto.Branch;

public class TestPerAddr {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
		Branch branch=(Branch) ac.getBean("bran");
		branch.ad.display();
		
	}

}
