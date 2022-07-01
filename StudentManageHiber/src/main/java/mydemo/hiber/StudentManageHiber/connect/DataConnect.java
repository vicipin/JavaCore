package mydemo.hiber.StudentManageHiber.connect;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mydemo.hiber.StudentManageHiber.entity.Student;

 
public class DataConnect {
	private static SessionFactory fact;
	private DataConnect()
	{
		
	}
	public static SessionFactory getConnect()
	{
		fact=new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		return fact;
	}
	

}
