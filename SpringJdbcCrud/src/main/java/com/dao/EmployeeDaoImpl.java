package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.dto.Employee;

public class EmployeeDaoImpl implements EmpDao {

	private JdbcTemplate jdbcTemplate;

	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;

	}

	@Override
	public void save(Employee employee) {
		String query = "insert into employee (id, name, city) values (?,?,?)";
		Object[] args = new Object[] { employee.getId(), employee.getName(), employee.getCity() };

		int out = jdbcTemplate.update(query, args);

		if (out != 0) {
			System.out.println("Employee saved with id=" + employee.getId());
		} else
			System.out.println("Employee save failed with id=" + employee.getId());
	}

	


}
