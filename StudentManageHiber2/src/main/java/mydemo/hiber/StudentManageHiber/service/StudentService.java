package mydemo.hiber.StudentManageHiber.service;
import java.util.*;

import mydemo.hiber.StudentManageHiber.dao.StudentDAOImpl;
import mydemo.hiber.StudentManageHiber.dao.StudentInter;
import mydemo.hiber.StudentManageHiber.entity.Address;
import mydemo.hiber.StudentManageHiber.entity.Student;
public class StudentService {
	private Scanner sc;
	private int noofstudent;
	private StudentInter studentobj;
	public StudentService()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter no of Students ");
		noofstudent=sc.nextInt();
		studentobj=new StudentDAOImpl();
		
	}
	public void insertOp()
	{
		for(int x=1;x<=noofstudent;x++)
		{
			Student s1=new Student();
			System.out.println("Enter Student code");
			s1.setStudent_id(sc.nextInt());
			System.out.println("Student name ");
			s1.setStudentname(sc.next());
			System.out.println("Enter Score ");
			s1.setScore(sc.nextInt());
			Address a=new Address();
			System.out.println("Enter houseno");
			a.setHouseno(sc.nextInt());
			System.out.println("Enter city");
			a.setCity(sc.next());
			System.out.println("Enter State");
			a.setState(sc.next());
			System.out.println("Enter Country");
			a.setCountry(sc.next());
			s1.setAdd(a);
			
			studentobj.addDetails(s1);
			
		}
	}
	

}
