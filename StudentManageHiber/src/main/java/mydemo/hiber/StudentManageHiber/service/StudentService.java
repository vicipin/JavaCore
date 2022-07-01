package mydemo.hiber.StudentManageHiber.service;
import java.util.*;

import mydemo.hiber.StudentManageHiber.dao.StudentDAOImpl;
import mydemo.hiber.StudentManageHiber.dao.StudentInter;
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
	public void insertData()
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
			studentobj.addDetails(s1);
			
		}
	}

	public void updateData() {
		
		Student s1=new Student();
		System.out.println("Pls enter student id u would like to update");
		int id=sc.nextInt();
		studentobj.updateDetails(id);
		
	}
	public void delete() {
		
		Student s1=new Student();
		System.out.println("Pls enter student id u would like to delete");
		int id=sc.nextInt();
		studentobj.removeDetails(id);
		
	}
	public void retreive() {
		
		Student s1=new Student();
		List <Student> student=new ArrayList();
		student=studentobj. getDetails();
		
		for (Student s: student ) {
			
			System.out.println("Student code  " + s.getStudent_id());
			System.out.println("Student name  " + s.getStudentname());
			System.out.println("Student score  " + s.getScore());
			
		}
		
		
	}
	

}
