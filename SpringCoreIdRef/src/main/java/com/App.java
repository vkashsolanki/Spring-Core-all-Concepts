package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/Comfiguration.xml");
		Student beans = (Student) applicationContext.getBean("student");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Address bean = (Address) applicationContext.getBean("addr");
	    System.out.println(bean);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		

		String stdobj = beans.getStudnetObj();
     	Address address = (Address) applicationContext.getBean(stdobj, Address.class);
     	beans.getStudentObject();
        System.out.println(address);


	}
}
