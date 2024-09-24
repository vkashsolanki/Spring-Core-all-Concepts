package com.jdbc.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.jdbc.dao.StudentDao;
import com.jdbc.dao.StudentDaoImpl;

@ComponentScan(basePackages = "com.jdbc")
@Configuration
public class JavaConfiguration {

	@Bean
	public DataSource getStudentDataSource() {

		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/springjdbc12");
		source.setUsername("root");
		source.setPassword("root");

		return source;

	}

	@Bean
	public JdbcTemplate getStudentJdbcTemplate() throws Exception {

		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(getStudentDataSource());
		jt.getDataSource().getConnection();

		return jt;

	}
	

}
