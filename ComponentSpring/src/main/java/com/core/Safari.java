package com.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "safari")
public class Safari implements Car {

	@Override
	public String getCarName() {
		
		
		
		return "Safari";
	}
	
	
	

}
