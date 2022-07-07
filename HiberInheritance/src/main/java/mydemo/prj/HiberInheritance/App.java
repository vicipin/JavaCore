package mydemo.prj.HiberInheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mydemo.prj.HiberInheritance.entity.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory fact=new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(Employee.class).
    			addAnnotatedClass(PermanentEmployee.class).addAnnotatedClass(TempEmployee.class).buildSessionFactory();
    	Session ses=fact.openSession();
    	Employee e1=new Employee();
    	e1.setEmpid(1);
    	e1.setEmpname("Jorden");
    	PermanentEmployee pem=new PermanentEmployee();
    	pem.setEmpid(2);
    	pem.setEmpname("VAnshita");
    	pem.setSalary(324234);
    	Transaction tx=ses.beginTransaction();
    	ses.save(e1);
    	ses.save(pem);
    	tx.commit();
    	
    }
}
