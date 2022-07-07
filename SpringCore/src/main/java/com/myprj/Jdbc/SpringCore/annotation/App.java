package com.myprj.Jdbc.SpringCore.annotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myprj.Jdbc.SpringCore.College;
import com.myprj.Jdbc.SpringCore.Employee;
import com.myprj.Jdbc.SpringCore.Student;

public class App {
		
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotconfig=
				new AnnotationConfigApplicationContext(StudentConfiguration.class);
		College c=(College)annotconfig.getBean("col");
		System.out.println("name is "+c.getCollegename());
		Student sobj=c.getStudent();
		System.out.println("Student name is "+sobj.getStudentname());
	}
		

}
