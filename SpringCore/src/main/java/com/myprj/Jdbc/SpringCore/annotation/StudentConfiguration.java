package com.myprj.Jdbc.SpringCore.annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.myprj.Jdbc.SpringCore.College;
import com.myprj.Jdbc.SpringCore.Student;

@Configuration
public class StudentConfiguration {
	
	@Bean(name="Student1")
	public Student getStudent()
	{
		Student s1=new Student();
		s1.setScore(24);
		s1.setStudentcode(34);
		s1.setStudentname("Zinger");
		return s1;
		
	}
	@Bean(name="col")
	public College getCollege()
	{
		College c=new College();
		c.setCollegecode(3000);
		c.setCollegename("hogwins");
		return c;
	}

}
