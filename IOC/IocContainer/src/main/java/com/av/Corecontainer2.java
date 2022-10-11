package com.av;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Corecontainer2 {

public static void main(String[] args) {		
		
		ClassPathResource cPathResource=new  ClassPathResource("myspring2.xml");
		BeanFactory bF=new XmlBeanFactory(cPathResource);
		
		Student s=(Student) bF.getBean("stu");
		s.displayStudent();
				
	}

}
