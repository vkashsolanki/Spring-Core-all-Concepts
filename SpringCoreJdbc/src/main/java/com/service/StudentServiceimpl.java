package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dto.Student;

public class StudentServiceimpl implements StudentSevice {

	private JdbcTemplate jdbcTemplate;
	
	ResultSet resultSet;
	RowMapper rowNum;

	public StudentServiceimpl() {
		super();
	}

	public StudentServiceimpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	// create
	public void createStudent(Student st) {

		/*
		 * // jdbc coonection
		 * 
		 * try { Connection c = jdbcTemplate.getDataSource().getConnection();
		 * PreparedStatement statement = c
		 * .prepareStatement("insert into student(id, name, email, password) values(?,?,?,?)"
		 * );
		 * 
		 * System.out.println(statement); statement.setInt(1, st.getId());
		 * statement.setString(2, st.getName()); statement.setString(3, st.getEmail());
		 * statement.setString(4, st.getPassword()); int update =
		 * statement.executeUpdate(); if (update > 0) { System.out.println("Sucess");
		 * 
		 * } else { System.out.println("Fialed"); }
		 * 
		 * System.out.println(c); } catch (SQLException e) {
		 * 
		 * e.printStackTrace(); }
		 */

		String createQuery = "INSERT INTO student(id, name, email, password) values(?,?,?,?)";
		int update = jdbcTemplate.update(createQuery, st.getId(), st.getName(), st.getEmail(), st.getPassword());

		if (update > 0) {
			System.out.println("Sucess");
		} else {
			System.out.println("Failed");
		}

	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Student getStudentById(int id) {
//		String selects = "SELECT * FROM student WHERE id = ?";
//		return jdbcTemplate.queryForObject(selects, new Object[] {id},
//				(resultSet, rowNum) -> new Student());
//
//	}

}
