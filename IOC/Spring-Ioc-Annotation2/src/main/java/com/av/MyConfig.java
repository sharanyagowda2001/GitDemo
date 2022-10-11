package com.av;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.av.dto.Employee;

@Configuration
@ComponentScan(basePackages = "com.av")

public class MyConfig {
	
	@Bean(value="emp")
	
	public Employee getEmployee() {
		return new Employee();
	}
}
