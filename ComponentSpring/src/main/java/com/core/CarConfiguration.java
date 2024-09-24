package com.core;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.core")
public class CarConfiguration {

	@Bean(name = "show")
	public String getInfo() {

		return "Car-Configuration- info";

	}

	@Bean(name = "show")
	public String getShow() {

		return "GetShow function";
	}
	
	@Bean
	public Scanner getScanner()
	{
		
		
		return new Scanner(System.in);
	}
	
	
	
}
