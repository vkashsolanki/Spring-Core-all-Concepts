package com.service;

import java.util.List;

import com.dto.Employee;

public interface EmployeeService {
	
	public int saveEmployee(Employee employee);
	public int change(Employee employee);
	public int delete(int id);
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployee();

}
