package mydemo.hiber.StudentManageHiber.entity;
import javax.persistence.*;
@Entity
@Table(name="StudentDetails")
public class Student {
	@Id
	@Column(name="studentid")
	private int student_id;
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	@JoinColumn(name="address_id",referencedColumnName="houseno")
	
	private Address add;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Column(name="studentname")
	private String studentname;
	@Column(name="score")
	private int score;

}
