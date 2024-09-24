package com;

public class Address {

	private String country;
	private String state;
	private String city;
	private int pinCode;
	
	
	

	public Address() {

	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", city=" + city + ", pinCode=" + pinCode + "]";
	}

}
