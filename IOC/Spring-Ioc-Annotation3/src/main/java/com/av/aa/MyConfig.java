package com.av.aa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.av.dto.Adhar;
import com.av.dto.Person;

@Configuration
@ComponentScan(basePackages = "com.av")
public class MyConfig {

	//@Bean is not necessary as we are using @component for both classes
	//@Bean(value="per")
	
//	public Person getPerson() {
//		return new Person();
//	}
	

}
