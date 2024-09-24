package com;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmpDao;
import com.dao.EmployeeDaoImpl;
import com.dto.Employee;

public class App {
	public static void main(String[] args) {
		// Get the Spring Context
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("/**/conf.xml");
		// Get the EmployeeDAO Bean
		EmployeeDaoImpl dao = (EmployeeDaoImpl)context.getBean("emppdao", EmployeeDaoImpl.class);

		// Run some tests for JDBC CRUD operations
		Employee emp = new Employee();
		//int rand = new Random().nextInt(100);
		emp.setId(45);
		emp.setName("Pankaj");
		emp.setCity("Alwar");

		// Create
		dao.save(emp);

	}
}
