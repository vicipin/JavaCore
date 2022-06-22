package dao;
import java.util.*;

import java.util.*;

public class StudentDAO {
	private List<Student> studentlist;
	public StudentDAO()
	{
		studentlist=new ArrayList<Student>();
	}
	public void insertData(Student s)
	{
		studentlist.add(s);
		
	}
	public List<Student> getdata()
	{
		return studentlist;
	}

}



