package com.idref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
     
        
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/idref/Comfiguration.xml");
        Employee beans = (Employee) applicationContext.getBean("emp");
        System.out.println("Employee;s beans"+ beans);
        System.out.println( "**********************************************" );
        
        
        //System.out.println(beans.getEmpObject());
        String empobj = beans.getEmpObject();

        
       Address bean = (Address) applicationContext.getBean(empobj, Address.class);
       System.out.println("Address "+bean);
       
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
       beans.getAddressData();
        
    }
}
