package com.myprj.ContactManager.dao;

import java.util.List;

import com.myprj.ContactManager.entity.Contacts;
import com.myprj.ContactManager.entity.User;


public interface CRUD_inter {
	
	public void addUser(User u );
	public void removeUser(int id);
	public void updateUser(int id);
	public boolean isaUser(int id);
	
	public void addDetails(int id, Contacts contact);
	public void removeDetails(int id,String name);
	public void updateDetails(int id,String name);
	
	public List<Contacts> getDetails(int id);

}
