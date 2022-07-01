package com.myprj.College.dao;

import java.util.List;

import com.myprj.College.entity.College;
import com.myprj.College.entity.Student;



public interface CollegeInter {
	
		public void addDetails(College c);
		public void removeDetails(int collegeid);
		public List<College> getDetails();
		public void updateDetails(int collegeid);	
		

}
