package com.idref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {

	private int id;
	private String name;
	private String companyName;
	Address address;
	private String empObject;
	
	
	
	

	public String getEmpObject() {
		return empObject;
	}

	public void setEmpObject(String empObject) {
		this.empObject = empObject;
	}

	public Employee(String empObject) {
		super();
		this.empObject = empObject;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", companyName=" + companyName + "]";
	}

	
	public void getAddressData()
	{
		  ApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/idref/Comfiguration.xml");
	        Address b = (Address) applicationContext.getBean(empObject);
	        System.out.println(b);
	}
	
	
}
