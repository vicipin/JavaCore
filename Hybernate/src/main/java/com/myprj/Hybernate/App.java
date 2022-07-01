package com.myprj.Hybernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 * SessionFactory-this interface contains the pool of database connection.
 * Session-We will retreive Session object from SessionFactory to work in particular databse.
 * 
 * Transaction-it is defining sequence of steps within the sesson
 * 
 *
 */



public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sesfact=new Configuration().configure("hiber.cfg.xml")
    			.addAnnotatedClass(Employee.class).buildSessionFactory();
    	Session ses=sesfact.openSession();
    	Transaction tx=ses.beginTransaction();
    	Employee emp=new Employee();
    	emp.setEmpid(1);
    	emp.setEmpname("Rubina");
    	emp.setSalary(33212.22);
    	ses.save(emp);
    	tx.commit();
    	System.out.println("Data Saved");
    }
}
