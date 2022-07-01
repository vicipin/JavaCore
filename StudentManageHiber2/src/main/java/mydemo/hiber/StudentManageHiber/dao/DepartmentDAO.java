package mydemo.hiber.StudentManageHiber.dao;
import org.hibernate.*;

import mydemo.hiber.StudentManageHiber.connect.DataConnect;
import mydemo.hiber.StudentManageHiber.entity.Department;
import mydemo.hiber.StudentManageHiber.entity.Employee;

import java.util.*;
public class DepartmentDAO {
	private Department d;
	private Scanner sc;
	private SessionFactory fact;
	public DepartmentDAO()
	{
		fact=DataConnect.getConnect();
		sc=new Scanner(System.in);
	}
	public void insert()
	{
		Session sess1=fact.openSession();
		d=new Department();
		System.out.println("Enter department code");
		d.setDeptcode(sc.nextInt());
		System.out.println("Enter Department name ");
		d.setDeptname(sc.next());
		System.out.println("Enter city");
		d.setCity(sc.next());
		System.out.println("Enter no of employees want to enter in department");
		List<Employee> emplist=new ArrayList<Employee>();
		int noofemployee=sc.nextInt();
		for(int x=1;x<=noofemployee;x++)
		{
			Employee e1=new Employee();
			System.out.println("Enter employee code");
			e1.setEmpid(sc.nextInt());
			System.out.println("Enter employee name ");
			e1.setEmpname(sc.next());
			System.out.println("Enter salary");
			e1.setSalary(sc.nextDouble());
			emplist.add(e1);
		}
		d.setEmplist(emplist);
		sess1.save(d);
		System.out.println("Data saved");
	}
	
	
	

}
