package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/config.xml");
		System.out.println(" adfsafasfasdfas" + context);
		System.out.println(context.getBean("dataSource"));

	}
}
