package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Student;
import com.service.StudentServiceimpl;
import com.service.StudentSevice;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/configuration.xml");

		Student s = new Student();
		s.setId(0300);
		s.setName("Ramssingh");
		s.setEmail("ramkomalnm@gmail.com");
		s.setPassword("l45145");
		StudentSevice bean = (StudentSevice) context.getBean("studentService", StudentServiceimpl.class);

		bean.createStudent(s);
		System.out.println(bean);

	}
}
