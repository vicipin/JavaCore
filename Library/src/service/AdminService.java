package service;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.Admin;
import dao.AdminDao;
import dao.Libraian;

public class AdminService {
	
	private AdminDao admindao;
	private Scanner sc;
	public AdminService()
	{
		admindao=new AdminDao();
		sc=new Scanner(System.in);
	}
	public void insert()
	{
	System.out.println("Enter no of lIbraian records u want");
	int noofDepartment=sc.nextInt();
	for(int x=1;x<=noofDepartment;x++)
	{
		Admin admin=new Admin();
		Libraian lib=new Libraian();
		
		System.out.println("Enter libraian Id ");
		lib.setLiberianId(sc.nextInt());
		System.out.println("Enter libraian Name ");
		lib.setLibrarianname(sc.next());
		System.out.println("Enter libraian Qualification, enter 1 or 0 ");
		lib.setQualifications(sc.nextInt());
		System.out.println("Enter Libraian Salary ");
		lib.setSalary(sc.nextDouble());
		admindao.insertlib(lib);
		admin.setLibList(admindao.getdata());
		
	}
	}
	public void retreive()
	{
		List<Libraian> ldata=admindao.getdata();
		for(Libraian liba:ldata)
		{
			
				System.out.println("Liberain name is "+liba.getLibrarianname());
				System.out.println("Liberain ID is "+liba.getLiberianId());
				System.out.println("Liberain qualification is "+liba.getQualifications());
				System.out.println("Liberain salary is "+liba.getSalary());
				
			
		}
	}
	public void Libremove(int id) {
		
		List<Libraian> ldata=admindao.getdata();
		for(Iterator<Libraian> iterator = ldata.iterator(); iterator.hasNext();)
		{
			Libraian liba=iterator.next();
			if(liba.getLiberianId()== id) {
				
				iterator.remove();
				
			}	
			
		}
		for(Libraian liba:ldata)
		{
			
				System.out.println("Liberain name is "+liba.getLibrarianname());
				System.out.println("Liberain ID is "+liba.getLiberianId());
				System.out.println("Liberain qualification is "+liba.getQualifications());
				System.out.println("Liberain salary is "+liba.getSalary());	
			
		}
			
		
	}

}
