package com.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "maruti")
public class Maruti implements Car {

	@Override
	public String getCarName() {

		return "Maruti";
	}

}
