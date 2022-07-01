package com.myprj.College.dao;

import java.util.List;

import com.myprj.College.entity.Student;

public interface Studentinter {
	
	public void saddDetails(Student s);
	public void sremoveDetails(int Studentid);
	public List<Student> sgetDetails();
	public void supdateDetails(int Studentid);	

}
