package com.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.config.JavaConfiguration;
import com.jdbc.dao.StudentDao;
import com.jdbc.dao.StudentDaoImpl;
import com.jdbc.dto.Student;

/**
 * Hello world!
 *
 */
public class App {
	

//		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jdbc/application.xml");
//		StudentDao studentDao = applicationContext.getBean("studentDao", StudentDao.class);

//		Student student = new Student();
//		student.setId(321);
//		student.setName("Kalyani");
//		student.setCity("Delhi");
//		int result = studentDao.insert(student);
//		System.out.println("Number rows effected are:=>" + result);
		
	   public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		StudentDao studentDao = context.getBean("students", StudentDaoImpl.class);
		
		
//		Student student = new Student();
//		student.setId(123456);
//		student.setName("Shanwak");
//		student.setCity("Noida");
//		int result = studentDao.insert(student);
//		System.out.println("Number rows effected are:=>" + result);
		
		

		Student student = new Student();
		student.setId(123);
		student.setName("ManishKumar");
		student.setCity("Maharashtra");
		int result = studentDao.change(student);
		System.out.println(result);
	


}
}
