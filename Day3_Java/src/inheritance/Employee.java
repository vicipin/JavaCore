package inheritance;
import java.util.*;

public class Employee {

	protected Scanner sc;//it can be access in any child class in any package.
	private int empid;
	private String empname;
	public Employee()
	{
		sc=new Scanner(System.in);
		
	}
	public void accept()
	{
		System.out.println("Enter Employee id ");
		empid=sc.nextInt();
		System.out.println("Enter Employee Name ");
		empname=sc.next();
	}
	public void display()
	{
		System.out.println("Employee Id is "+empid);
		System.out.println("Employee Name is "+empname);
	}

}
