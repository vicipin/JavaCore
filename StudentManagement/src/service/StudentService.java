package service;
import java.util.*;

import dao.Student;
import dao.StudentDAO;

public class StudentService {
	private StudentDAO sdao;
	private Scanner sc;
	public StudentService()
	{
		sdao=new StudentDAO();
		sc=new Scanner(System.in);
	}
	public void insert()
	{
	System.out.println("Enter no of students u want");
	int noofstudent=sc.nextInt();
	for(int x=1;x<=noofstudent;x++)
	{
		Student s1=new Student();
		System.out.println("Enter Student id ");
		s1.setStudentid(sc.nextInt());
		System.out.println("Enter Student Name ");
		s1.setStudentname(sc.next());
		System.out.println("Enter Score ");
		s1.setScore(sc.nextDouble());
		sdao.insertData(s1);
		
	}
	}
	public void retreive()
	{
		List<Student> sdata=sdao.getdata();
		for(Student s1:sdata)
		{
			System.out.println("Student name is "+s1.getStudentname());
			System.out.println("Score is "+s1.getScore());
	}
	
	}
	

}