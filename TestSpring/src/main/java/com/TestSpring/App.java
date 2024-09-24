package com.TestSpring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        
     AbstractApplicationContext ap =  new ClassPathXmlApplicationContext("com/TestSpring/Comfiguration.xml");
    Employee bean =(Employee) ap.getBean("emp", Employee.class);
    
    ap.registerShutdownHook();
    
    System.out.println(bean);
        
        
    }
}
