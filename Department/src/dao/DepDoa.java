package dao;

import java.util.ArrayList;
import java.util.List;


public class DepDoa {
	
	private List<Department> departmentlist;
	private List<Employee> emplist;
	public DepDoa()
	{
		departmentlist=new ArrayList<Department>();
		emplist= new ArrayList<Employee>();
	}
	public void insertData(Department d)
	{
		departmentlist.add(d);
		
	}
	public void insertemp(Employee e)
	{
		emplist.add(e);
		
	}
	
	public List<Department> getdata()
	{
		return departmentlist;
	}
	public List<Employee> getemp()
	{
		return emplist;
	}

}
