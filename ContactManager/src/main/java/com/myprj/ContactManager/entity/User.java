package com.myprj.ContactManager.entity;
import java.util.*;
import javax.persistence.*;
@Entity
@Table(name="UserTable")

public class User {
	@Id
	@Column(name="userid")
	private int id;
	private String UserName;
	private String Password;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private List<Contacts> ContactList;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public List<Contacts> getContactList() {
		return ContactList;
	}
	public void setContactList(List<Contacts> contactList) {
		ContactList = contactList;
	}
	

}
