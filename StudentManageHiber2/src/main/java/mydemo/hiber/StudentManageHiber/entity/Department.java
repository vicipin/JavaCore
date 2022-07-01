package mydemo.hiber.StudentManageHiber.entity;
import javax.persistence.*;
import java.util.*;
@Entity
@Table(name="deptonetomany")

public class Department {
	@Id
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
	public List<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}
private String deptname;
private String city;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="Depart_code")
private List<Employee> emplist;
}
