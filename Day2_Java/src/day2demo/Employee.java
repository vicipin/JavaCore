package day2demo;
import java.util.*;

public class Employee {
	
	public int employeeid;
	public String employeename;
	public double salary;
	

	 public void acceptDetails(){
		 
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		 
		 
		 System.out.println("Enter empoyeeid");
		 employeeid=sc.nextInt();
		 
		 System.out.println("Enter employeename");
		 employeename=sc1.next();
		 
		 System.out.println("Enter salary");
		 salary=sc2.nextDouble();
		 
		 
	 }
	 
	 public void displayDetails(){
		 
		 System.out.println("empoyeeid "+ employeeid);
		 System.out.println("empoyeename "+ employeename);
		 System.out.println("salary "+ salary);
		 
	 }
	 
	 public static void main(String args[]) {
		 Employee employee=new Employee();
		 employee.acceptDetails();
		 employee.displayDetails();
		 
	 }
	 
	

}
