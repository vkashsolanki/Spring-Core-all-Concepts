package com;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Employee;
import com.service.EmployeeService;

public class App 
{
    public static void main( String[] args )
    {
       
    	
    	
    	 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/configurationapp.xml");
    	 EmployeeService bean = (EmployeeService) applicationContext.getBean("employeeServiceImpl");
    	 //System.out.println(bean);
    	 
    	 
    	 ////////////////////////////////////////////// SAVE DATA  //////////////////////////////////////////////////////////
//    	 Scanner sc = new Scanner(System.in);
//    	 System.out.println("Enther the student id");
//    	 int id = sc.nextInt();
//    	 System.out.println("Enther the student Name");
//    	 String name = sc.next().trim();
//    	 System.out.println("Enther the student City");
//    	 String city = sc.next().trim();
//    	 
//    	 Employee employee = new Employee(id, name, city);
//    	 int saveEmployee = bean.saveEmployee(employee);
//    	 System.out.println("Save student details  "+saveEmployee);
//    	 
    	 
    	 
    	 
         // update data
//       // Take input From user with Scanner 
//       System.out.println( "+++++++++++++++++++++++ Data Update Here +++++++++++++++++++++" );
//       Scanner scanner2 = new Scanner(System.in);
//       System.out.println("Update the Employee id");
//       int id1 = scanner2.nextInt();
//       System.out.println("Update the Employee Name");
//       String name1 = scanner2.next().trim();
//       System.out.println("Update the Employee City");
//       String city1 = scanner2.next().trim();
//       Employee employee2 = new Employee(id1,name1,city1);
//       int update = bean.change(employee2);
//       
//       System.out.println("Update Succeefully Successfully !..."+update);
//       
//       //delete data
//       
//     // Take input From user with Scanner
//     System.out.println( "+++++++++++++++++++++++ Data Delete Here +++++++++++++++++++++" );
//     Scanner scanner1 = new Scanner(System.in);
//     System.out.println("Delete the Employee id");
//     int id2 = scanner1.nextInt();
//
//    //Employee employee2 = new Employee(id1);
//     int delete = bean.delete(id2);
//     
//     System.out.println("Delete Successfully !..."+delete);
//     System.out.println("Thank You For Using Crud Operations Here Welcome");
     
     
      System.out.println( "+++++++++++++++++++++++ Show All DATA Here +++++++++++++++++++++" );
      //Employee employee3 = new Employee();
      List<Employee> employee1 = bean.getAllEmployee();
      for(Employee employees:employee1)
      {
   	   System.out.println(employees);
      }
     
//      
//      System.out.println( "+++++++++++++++++++++++ Show Only Single DATA Here +++++++++++++++++++++" );
//      // select query for single data fetch       
//      Employee employee2 = employeDao.getEmployee(500);
//      System.out.println(employee2);
       

    	 
    	 
    	 
    	 
    	
         
    }
}
