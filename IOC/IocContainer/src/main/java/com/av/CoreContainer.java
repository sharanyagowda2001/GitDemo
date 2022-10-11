package com.av;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CoreContainer {

	public static void main(String[] args) {		
		
		ClassPathResource cPathResource=new  ClassPathResource("myspring.xml");
		BeanFactory bF=new XmlBeanFactory(cPathResource);
		
		Pencil p=(Pencil) bF.getBean("Pencil");
		p.display();
				
	}

}
