package com.springcore;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		
		System.out.println("Setter is called");
		
		this.city = city;
	}
	
	/*
	 * static {
	 * 
	 * System.out.println("Student Class is loaded..... "); }
	 */
	
	
	Student(){
		
		System.out.println("Student object is created");
	}

}
