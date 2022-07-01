package mydemo.hiber.StudentManageHiber.connect;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mydemo.hiber.StudentManageHiber.entity.Address;
import mydemo.hiber.StudentManageHiber.entity.Department;
import mydemo.hiber.StudentManageHiber.entity.Employee;
import mydemo.hiber.StudentManageHiber.entity.Student;

 
public class DataConnect {
	private static SessionFactory fact;
	private DataConnect()
	{
		
	}
	public static SessionFactory getConnect()
	{
		fact=new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(Student.class).
				addAnnotatedClass(Address.class).addAnnotatedClass(Department.class).addAnnotatedClass(Employee.class).
				buildSessionFactory();
		return fact;
	}
	

}
