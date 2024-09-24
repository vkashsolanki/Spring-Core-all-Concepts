package com.springtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */

@Configuration
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AnnotationConfigApplicationContext acat= new AnnotationConfigApplicationContext(ConfigurationClass.class);
        
        Student bean = acat.getBean(Student.class);
        System.out.println(acat);
        Student s= new Student();
        s.setId(10);
        s.setName("ram");
        s.setEmail("ram@gmail.com");
       
       System.out.println(s);
        
        
        
        
    }
}
