package com.jdbc.dao;

import org.springframework.stereotype.Service;

import com.jdbc.dto.Student;
import com.jdbc.repo.StudentRepository;

@Service(value = "students")
public class StudentDaoImpl implements StudentDao {

	private StudentRepository repository;

	public StudentDaoImpl(StudentRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public int insert(Student student) {
		int insertStudent = repository.insertStudent(student);
		return insertStudent;
	}

	@Override
	public int change(Student student) {
		int updateStudent = repository.updateStudent(student);
		return updateStudent;
	}

}
