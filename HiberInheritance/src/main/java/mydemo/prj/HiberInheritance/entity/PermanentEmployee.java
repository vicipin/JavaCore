package mydemo.prj.HiberInheritance.entity;
import javax.persistence.*;
@Entity
@Table(name="pempSubclass")
//@DiscriminatorValue("PEmployee")
@PrimaryKeyJoinColumn(name="employee_id")
public class PermanentEmployee extends Employee{
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private double salary;

}
