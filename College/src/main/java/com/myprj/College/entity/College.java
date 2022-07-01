package com.myprj.College.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="College")

public class College {
	@Id
	private int Collegecode;
	public int getCollegecode() {
		return Collegecode;
	}

	public void setCollegecode(int collegecode) {
		Collegecode = collegecode;
	}

	public String getCollegename() {
		return Collegename;
	}

	public void setCollegename(String collegename) {
		Collegename = collegename;
	}

	public List<Student> getStu_list() {
		return Stu_list;
	}

	public void setStu_list(List<Student> stu_list) {
		Stu_list = stu_list;
	}

	@Column(name="studentname")
	private String Collegename;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Collegecode")
	private List<Student> Stu_list;

}
