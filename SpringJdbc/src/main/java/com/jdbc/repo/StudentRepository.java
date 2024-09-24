package com.jdbc.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.dto.Student;

@Repository
public class StudentRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public StudentRepository(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertStudent(Student student) {
		String query = "insert into student (id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	public int updateStudent(Student student) {
		String query = "update student set name=?,city=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}

}
