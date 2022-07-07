package com.myprj.ContactManager.connect;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myprj.ContactManager.entity.Contacts;
import com.myprj.ContactManager.entity.User;





 
public class DataConnect {
	private static SessionFactory fact;
	private DataConnect()
	{
		
	}
	public static SessionFactory getConnect()
	{
		fact=new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(Contacts.class).addAnnotatedClass(User.class)
				.buildSessionFactory();
		return fact;
	}
	

}
