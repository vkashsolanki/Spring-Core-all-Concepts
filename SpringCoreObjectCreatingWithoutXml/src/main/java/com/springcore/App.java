package com.springcore;

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
        
        AbstractApplicationContext a=  new ClassPathXmlApplicationContext("com/springcore/Comfiguration.xml");
        
        
        
        
        
    }
}
