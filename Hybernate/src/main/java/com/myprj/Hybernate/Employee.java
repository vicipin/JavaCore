package com.myprj.Hybernate;
import javax.persistence.*;


@Entity
@Table(name="empDetails")
public class Employee {
	@Id
	@Column(name="Employee_id")
	private int empid;
	@Column(name="Employee_name")
	private String empname;
	@Column(name="Salary")
	private double salary;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
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
