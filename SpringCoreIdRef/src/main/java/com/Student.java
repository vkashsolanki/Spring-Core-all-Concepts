package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {

	private int id;
	private String name;
	private String email;
	private Address address;
	private String studnetObj;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	public Student(String studnetObj) {
		super();
		this.studnetObj = studnetObj;
	}

	public Student(Address address) {
		super();
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStudnetObj() {
		return studnetObj;
	}

	public void setStudnetObj(String studnetObj) {
		this.studnetObj = studnetObj;
	}

	public void getStudentObject() {

		ApplicationContext ac = new ClassPathXmlApplicationContext("com/Comfiguration.xml");
		Address ad = (Address) ac.getBean(studnetObj);
		System.out.println(ad);

	}

}
