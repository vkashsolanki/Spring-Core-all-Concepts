package com.core;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "cs")
public class CarService {

	@Autowired
	@Qualifier(value = "maruti")
	Car car;
	@Autowired
	Scanner scanner;
	
	
	public String getName() {

		return car.getCarName();
	}
	
	
	public Scanner getScan()
	{
		return scanner;
	}
	
	

}
