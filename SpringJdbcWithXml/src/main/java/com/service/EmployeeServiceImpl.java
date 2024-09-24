package com.service;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	JdbcTemplate jdbcTemplate;

	// insert data
	@Override
	public int saveEmployee(Employee employee) {

		String query = "insert into employee(id, name, city) values(?,?,?)";
		int save = this.jdbcTemplate.update(query, employee.getId(), employee.getName(), employee.getCity());

		return save;
	}

	// update data
	public int change(Employee employee) {

		String query = "update employee set name=?, city=? where id=?";
		int result = this.jdbcTemplate.update(query, employee.getName(), employee.getCity(), employee.getId());

		return result;
	}

	public int delete(int id) {

		String query = "delete from employee where id=?";
		int delete = this.jdbcTemplate.update(query, id);
		return delete;
	}

	// select all obejct data
	public List<Employee> getAllEmployee() {

		String query = "select * from employee";
		List<Employee> employees = this.jdbcTemplate.query(query, new RowMapperImpl());
		return employees;

	}

	// single data fetch

	public Employee getEmployee(int id) {
		String query = "select * from employee where id=?";
		RowMapper rowMapper = new RowMapperImpl();
		Employee employee = (Employee) this.jdbcTemplate.queryForObject(query, rowMapper, id);
		return employee;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
