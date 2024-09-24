package com.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
	
	@Bean
	public Student getConfig() {
		
		return new Student();
	}
	
	

}
