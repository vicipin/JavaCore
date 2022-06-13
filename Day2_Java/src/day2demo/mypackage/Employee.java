package day2demo.mypackage;

public class Employee {
	
	private int empid;
	private String empname;
	private double salary;
	public void setEmpid(int empid)
	{
		this.empid=empid;//this can be used to access instance variable
	}
	public int getEmpid()
	{
		return this.empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
