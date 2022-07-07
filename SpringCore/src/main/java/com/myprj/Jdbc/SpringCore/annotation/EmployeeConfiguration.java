package com.myprj.Jdbc.SpringCore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.myprj.Jdbc.SpringCore.Employee;

@Configuration
public class EmployeeConfiguration {
	/*<bean id="emp1" class=mypackage.Employee>*/
	@Bean(name="employee1")
	public Employee getEmp()
	{
		Employee e1=new Employee();
		e1.setEmpid(10);
		e1.setEmpname("Vanita");
		e1.setSalary(23433.2);
		return e1;
		
	}
	@Bean(name="employee2")
	public Employee getEmp1()
	{
		Employee e1=new Employee();
		e1.setEmpid(11);
		e1.setEmpname("Joseph");
		e1.setSalary(23433.2);
		return e1;
		
	}
	@Bean(name="dep")
	public Department getDept()
	{
		Department d=new Department();
		d.setDeptcode(1001);
		d.setDeptname("Finance");
		d.setCity("Mumbai");
		return d;
	}

}