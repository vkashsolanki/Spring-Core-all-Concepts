package com.jdbc.dao;

import com.jdbc.dto.Student;

public interface StudentDao {

	public int insert(Student student);
	
	public int change(Student student);

}
