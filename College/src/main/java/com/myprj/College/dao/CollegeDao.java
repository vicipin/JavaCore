package com.myprj.College.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.myprj.College.connect.DataConnect;
import com.myprj.College.entity.College;



public class CollegeDao implements CollegeInter {
	
	private SessionFactory fact;
	private Session ses;
	private Transaction tx;
	public CollegeDao()
	{
		fact=DataConnect.getConnect();
	}
	@Override
	public void addDetails(College c) {
		ses=fact.openSession();
		tx=ses.beginTransaction();
		ses.save(c);
		tx.commit();
		System.out.println("Data saved");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDetails(int id) {
		// TODO Auto-generated method stub
		ses=fact.openSession();
		tx=ses.beginTransaction();
		College s1=ses.find(College.class, id);
		if(s1!=null)
		{
			ses.remove(s1);
			tx.commit();
			System.out.println("Data deleted");
		}
		else
		{
			System.out.println("No record find");
		}
		
	}

	@Override
	public List<College> getDetails() {
		// TODO Auto-generated method stub
		Session ses=fact.openSession();
		Query query=ses.createQuery("from Student");
		List<College> collegelist=query.list();
		return collegelist;
	}

	@Override
	public void updateDetails(int id) {
		Session ses=fact.openSession();
		tx=ses.beginTransaction();
		Scanner sc=new Scanner(System.in);
		College c1=ses.find(College.class, id);
		if(c1!=null)
		{
			System.out.println("Enter new code");
			c1.setCollegecode(sc.nextInt());
			ses.update(c1);
			tx.commit();
		}
	}

}
