package com.myprj.Jdbc.SpringCore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.myprj.Jdbc.SpringCore.Employee;

@Component
public class Department {
	
	private int deptcode;
	public int getDeptcode() {
		return deptcode;
	}
	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
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
	private String deptname;
	private String city;
	@Autowired
	@Qualifier("employee1")
	private Employee emp1;
	

}
