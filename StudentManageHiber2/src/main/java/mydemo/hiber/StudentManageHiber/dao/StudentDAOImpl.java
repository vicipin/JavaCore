package mydemo.hiber.StudentManageHiber.dao;

import java.util.List;
import org.hibernate.*;
import org.hibernate.query.Query;
import mydemo.hiber.StudentManageHiber.connect.DataConnect;
import mydemo.hiber.StudentManageHiber.entity.Student;

public class StudentDAOImpl implements StudentInter {
	private SessionFactory fact;
	private Session ses;
	private Transaction tx;
	public StudentDAOImpl()
	{
		fact=DataConnect.getConnect();
	}
	@Override
	public void addDetails(Student s) {
		ses=fact.openSession();
		tx=ses.beginTransaction();
		ses.save(s);
		tx.commit();
		System.out.println("Data saved");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDetails(int studentid) {
		// TODO Auto-generated method stub
		ses=fact.openSession();
		tx=ses.beginTransaction();
		Student s1=ses.find(Student.class, studentid);
		if(s1!=null)
		{
			ses.remove(s1);
			tx.commit();
			System.out.println("Data deleted");
		}
		else
		{
			System.out.println("No record find");
		}
		
	}

	@Override
	public List<Student> getDetails() {
		// TODO Auto-generated method stub
		Session ses=fact.openSession();
		Query query=ses.createQuery("from Student");
		List<Student> studentlist=query.list();
		return studentlist;
	}

	@Override
	public void updateDetails(int studentid) {
		Session ses=fact.openSession();
		tx=ses.beginTransaction();
		Student s1=ses.find(Student.class, studentid);
		if(s1!=null)
		{
			System.out.println("Enter new score");
			s1.setScore(90);
			ses.update(s1);
			tx.commit();
		}
	}
	

}
