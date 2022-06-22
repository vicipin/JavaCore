package service;

import java.util.List;
import java.util.Scanner;

import dao.Department;
import dao.DepDoa;
import dao.Employee;

public class DepService {
	
	private DepDoa Departmentdao;
	private Scanner sc;
	public DepService()
	{
		Departmentdao=new DepDoa();
		sc=new Scanner(System.in);
	}
	public void insert()
	{
	System.out.println("Enter no of Department records u want");
	int noofDepartment=sc.nextInt();
	for(int x=1;x<=noofDepartment;x++)
	{
		Department dep=new Department();
		Employee emp=new Employee();
		
		System.out.println("Enter Department Code ");
		dep.setDeptcode(sc.nextInt());
		System.out.println("Enter Department Name ");
		dep.setDeptname(sc.next());
		System.out.println("Enter Employye Code ");
		emp.setEmpcode(sc.nextInt());
		System.out.println("Enter Employye Name ");
		emp.setEmpname(sc.next());
		System.out.println("Enter Employye Salary ");
		emp.setSalary(sc.nextDouble());
		Departmentdao.insertemp(emp);
		dep.setEmplist(Departmentdao.getemp());
		Departmentdao.insertData(dep);
		
	}
	}
	public void retreive(int code)
	{
		List<Department> Dedata=Departmentdao.getdata();
		for(Department department:Dedata)
		{
			if (code == department.getDeptcode()) {
				System.out.println("Department name is "+department.getDeptname());
				System.out.println("Department code is "+department.getDeptcode());
				List<Employee> edata=department.getEmplist();
				for(Employee employee:edata)
				{
					System.out.println("employee name is "+ employee.getEmpname());
					System.out.println("employee code is "+ employee.getEmpname());
					System.out.println("employee salary is "+ employee.getSalary());	
					
				}
			}
		
			
		}
	}

}
