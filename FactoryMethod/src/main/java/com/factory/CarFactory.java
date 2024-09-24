package com.factory;

import java.lang.reflect.Constructor;

public class CarFactory {

	public String carName;

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	// object ke rakh lenge ye non static factory method h
	public Car getCarInstance() throws Exception
	{
	Class cl=	Class.forName(carName);
	Car car = (Car)cl.getConstructor().newInstance(cl);
		
		return car;
		
	}
}
