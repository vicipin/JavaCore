package day2demo.mypackage;
import java.util.*;

public class EmployeeMain {
	
	private Scanner sc;
	private Employee emparr[];
	public void accept()
	{
		sc=new Scanner(System.in);
		emparr=new Employee[5];
		for(int x=0;x<emparr.length;x++)
		{
			Employee e1=new Employee();
			System.out.println("Enter Employee id ");
			e1.setEmpid(sc.nextInt());
			System.out.println("Enter Employee name ");
			e1.setEmpname(sc.next());
			System.out.println("Enter Salary  ");
			e1.setSalary(sc.nextDouble());
			emparr[x]=e1;
			
		}
	}
	public void display()
	{
		for(int x=0;x<emparr.length;x++)
		{
			System.out.println("Employee id is "+emparr[x].getEmpid());
			System.out.println("Employee name is "+emparr[x].getEmpname());
		}
	}
	public static void main(String[] args) {
		EmployeeMain empmain=new EmployeeMain();
		empmain.accept();
		empmain.display();
	}


}
