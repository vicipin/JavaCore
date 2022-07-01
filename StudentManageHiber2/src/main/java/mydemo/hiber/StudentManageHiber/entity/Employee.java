package mydemo.hiber.StudentManageHiber.entity;
import javax.persistence.*;
@Entity
@Table(name="Emponetomany")
public class Employee {
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
	@Id
	private int empid;
	@Column(name="EmployeeName")
	private String empname;
	@Column(name="Salary")
	private double salary;
	

}
