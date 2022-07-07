package mydemo.prj.HiberInheritance.entity;
import javax.persistence.*;
@Entity
@Table(name="empsubclass")
@Inheritance(strategy=InheritanceType.JOINED)
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="emptype",discriminatorType=DiscriminatorType.STRING)
//@DiscriminatorValue("EmployeeData")
public class Employee {
	@Id
	private int empid;
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
	private String empname;

}
