package com.hibernate.core;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.core.bean.Student;


public class App 
{
    public static void main( String[] args )
    {
        
    	
    	Student student = new Student();
    	student.setName("Shyam");
    	student.setEmail("shyam.com");
    	student.setPassword("shyam123");
        
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();
        
        
    }
}
