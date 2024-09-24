package com.core;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				CarConfiguration.class);
		CarService cars = (CarService) annotationConfigApplicationContext.getBean("cs");
		Scanner scan = cars.getScan();
		Contact contact = annotationConfigApplicationContext.getBean(Contact.class);

		System.out.println("Enter the id ");
		int inext = scan.nextInt();
		contact.setId(inext);
		System.out.println("Enter the name  =>>");
		String name = scan.next();
		contact.setName(name);

		System.out.println(contact);
	}
}
