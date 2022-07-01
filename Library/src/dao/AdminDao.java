package dao;

import java.util.ArrayList;
import java.util.List;

public class AdminDao {
	
	
	private List<Libraian> liblist;
	public AdminDao()
	{
		
		liblist= new ArrayList<Libraian>();
	}
	
	public void insertlib(Libraian l)
	{
		liblist.add(l);
		
	}
	
	
	public List<Libraian> getdata()
	{
		return liblist;
	}

}
