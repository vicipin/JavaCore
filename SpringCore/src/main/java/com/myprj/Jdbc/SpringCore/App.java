package com.myprj.Jdbc.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * BeanFactory and ApplicationContext are predefined container interfaces.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext cont=new ClassPathXmlApplicationContext("Bean.xml");
    	College col1=(College)cont.getBean("coll");
    	System.out.println(" code is "+col1.getCollegecode());
    	System.out.println(" Name is "+col1.getCollegename());
    	Student s=col1.getStudent();
    	System.out.println("Student Name is "+s.getStudentname());
    	
}
}






