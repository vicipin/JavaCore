package com.myprj.College.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.myprj.College.connect.DataConnect;
import com.myprj.College.dao.CollegeDao;
import com.myprj.College.dao.CollegeInter;
import com.myprj.College.dao.Studentinter;
import com.myprj.College.entity.College;
import com.myprj.College.entity.Student;

import org.hibernate.*;

public class CollService {
	
	private Scanner sc;
	private int noofcollege;
	private int noofstudent;
	private CollegeInter collegeobj;
	
	public CollService()
	{
		sc=new Scanner(System.in);
		collegeobj=new CollegeDao();
		
		
	}
	public void insertData()
	{
		
			College c1=new College();
			Student s1=new Student();
			System.out.println("Enter College code");
			c1.setCollegecode(sc.nextInt());
			System.out.println("College name ");
			c1.setCollegename(sc.next());
			//Student Details
			System.out.println("Enter no of Student ");
			noofstudent=sc.nextInt();
			List<Student> s_list=new ArrayList<Student>();
			for(int y=1; y<=noofstudent; y++)
			{
				System.out.println("Enter Student code");
				s1.setStudent_id(sc.nextInt());
				System.out.println("Student name ");
				s1.setStudentname(sc.next());
				System.out.println("Enter Score ");
				s1.setScore(sc.nextInt());
				s_list.add(s1);
			
			}
			c1.setStu_list(s_list);
			collegeobj.addDetails(c1);
			System.out.println("Data saved");
	}
	
	public void updateData() {
		
		College c1=new College();
		System.out.println("Pls enter college code u would like to update");
		int id=sc.nextInt();
		collegeobj.updateDetails(id);
		
	}
	public void delete() {
		
		College c1=new College();
		System.out.println("Pls enter college Code u would like to delete");
		int id=sc.nextInt();
		collegeobj.removeDetails(id);
		
	}
	public void retreive() {
		
		College s1=new College();
		List <College> college=new ArrayList();
		college=collegeobj.getDetails();
		
		for (College c: college ) {
			
			System.out.println("Student code  " + c.getCollegecode());
			System.out.println("Student name  " + c.getCollegename());
			System.out.println("Student score  " + c.getStu_list());
				
			
		}
		
		
	}
	
	
	

}
