package com.av;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration//instead of xml configaration file
@ComponentScan(basePackages={"com.av"})
public class ReplaceMyMvcXml {
	@Bean
	public InternalResourceViewResolver viewResolver()//extension Controller
	{
		InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}
}