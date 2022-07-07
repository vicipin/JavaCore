package com.myprj.ContactManager.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.myprj.ContactManager.connect.DataConnect;
import com.myprj.ContactManager.entity.Contacts;
import com.myprj.ContactManager.entity.User;







public class ContactDao implements CRUD_inter {
	
	private SessionFactory fact;
	private Session ses;
	private Transaction tx;
	public ContactDao()
	{
		fact=DataConnect.getConnect();
	}
	@Override
	public void addUser(User u) {
		ses=fact.openSession();
		tx=ses.beginTransaction();
		ses.save(u);
		tx.commit();
		System.out.println("Data saved");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser(int id) {
		// TODO Auto-generated method stub
		ses=fact.openSession();
		tx=ses.beginTransaction();
		Contacts  u=ses.find(Contacts.class, id);
		if(u!=null)
		{
			ses.remove(u);
			tx.commit();
			System.out.println("Data deleted");
		}
		else
		{
			System.out.println("No record find");
		}
		
	}

	@Override
	public void updateUser(int id) {
		Session ses=fact.openSession();
		tx=ses.beginTransaction();
		Scanner sc=new Scanner(System.in);
		User u=ses.find(User.class, id);
		if(u!=null)
		{
			System.out.println("Enter new User name");
			u.setUserName(sc.next());
			System.out.println("Enter new User Password");
			u.setPassword(sc.next());;
			ses.update(u);
			tx.commit();
		}
	}
	
	@Override
	public boolean isaUser(int id) {
		
		Session ses=fact.openSession();
		tx=ses.beginTransaction();
		Scanner sc=new Scanner(System.in);
		User u=ses.find(User.class, id);
		if(u!=null)
		{
			
			return (u.getId()==id);
				
			
		}
		return false;
	}
	
	//Handle contact details
	
	@Override
	public List<Contacts> getDetails(int id) {
		Session ses=fact.openSession();
		Query query=ses.createQuery("from Contacts where user_id = :id ", Contacts.class);
		query.setParameter("id", id);
		List<Contacts> studentlist=query.list();
		return studentlist;
	}


	@Override
	public void addDetails(int id, Contacts contact) {
		Session ses=fact.openSession();
		tx=ses.beginTransaction();
		Scanner sc=new Scanner(System.in);
		User u=ses.find(User.class, id);
		
		if(u!=null)
		{
			u.getContactList().add(contact);
			ses.update(u);
			tx.commit();
		}
		
	}
	
	@Override
	public void updateDetails(int id, String name) {
		Session ses=fact.openSession();
		tx=ses.beginTransaction();
		Scanner sc=new Scanner(System.in);
		User u=ses.find(User.class, id);
		if(u!=null)
		{
			List <Contacts> contacts=new ArrayList();
			contacts=u.getContactList();
			for(Contacts contact:contacts) {
				
				if (contact.getFirstName().equals(name)) {
					
					System.out.println("Please new enter firt name");
					contact.setFirstName(sc.next());
					System.out.println("pls new enter last Name");
					contact.setLastName(sc.next());
					System.out.println("pls new enter mobile Number");
					contact.setMobileNumber(sc.next());
					System.out.println("pls new enter country");
					contact.setCountry(sc.next());
					System.out.println("pls new enter Adress");
					contact.setAdress(sc.next());
				}
				
			}
			
			ses.update(u);
			tx.commit();
		}
			
	}
	
	@Override
	public void removeDetails(int id, String name) {
		Session ses=fact.openSession();
		tx=ses.beginTransaction();
		Scanner sc=new Scanner(System.in);
		User u=ses.find(User.class, id);
		if(u!=null)
		{
			List <Contacts> contacts=new ArrayList();
			contacts=u.getContactList();
	
			for(Iterator<Contacts> iterator = contacts.iterator(); iterator.hasNext();)
			{
				Contacts cont=iterator.next();
				if(cont.getFirstName().equals(name)) {
					
					iterator.remove();
					System.out.println("Contact Data deleted");
					
				}	
				
			}
			
			ses.update(u);
			tx.commit();
		}
			
	}
	
	
	
	

}
