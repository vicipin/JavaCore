package com.myprj.College.connect;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myprj.College.entity.College;
import com.myprj.College.entity.Student;



 
public class DataConnect {
	private static SessionFactory fact;
	private DataConnect()
	{
		
	}
	public static SessionFactory getConnect()
	{
		fact=new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(College.class).addAnnotatedClass(Student.class)
				.buildSessionFactory();
		return fact;
	}
	

}