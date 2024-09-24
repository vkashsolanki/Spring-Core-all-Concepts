package com.core;

import org.springframework.stereotype.Component;

@Component(value = "con")
public class Contact {
	
	int id;
	String name;
	
	public Contact()
	{
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + "]";
	}

	

}
