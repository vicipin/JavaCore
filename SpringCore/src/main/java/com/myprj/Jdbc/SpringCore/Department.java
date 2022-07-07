package com.myprj.Jdbc.SpringCore;

public class Department {
	
	private int dept_code;
	public int getDept_code() {
		return dept_code;
	}
	public void setDept_code(int dept_code) {
		this.dept_code = dept_code;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee getEmp1() {
		return emp1;
	}
	public void setEmp1(Employee emp1) {
		this.emp1 = emp1;
	}
	private String dept_name;
	private String city;
	private Employee emp1;
	
	

}
