package com.myprj.ContactManager.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.myprj.ContactManager.dao.CRUD_inter;
import com.myprj.ContactManager.dao.ContactDao;
import com.myprj.ContactManager.entity.Contacts;
import com.myprj.ContactManager.entity.User;


public class ContactService {
	
	private Scanner sc;
	
	private int noofcontact;
	private CRUD_inter Contactobj;
	
	public ContactService()
	{
		sc=new Scanner(System.in);
		Contactobj=new ContactDao();
		
		
	}
	public void CreateNew_USer()
	{
		
			User user =new User();
			System.out.println("PLs enter user new user id ");
			user.setId(sc.nextInt());
			System.out.println("PLs enter user new user name ");
			user.setUserName(sc.next());
			System.out.println("Pls enter password");
			user.setPassword(sc.next());
			
			System.out.println("would u like to add contact enter 1 to comferm ");
			int res=0;
			res=sc.nextInt();
			Contacts contact=new Contacts();
			List<Contacts> contacts=new ArrayList<Contacts>();
			if (res==1) {
				
				System.out.println("pls enter number of contacts u wish to enter");
				noofcontact=sc.nextInt();
				for(int y=1; y<=noofcontact; y++)
				{
					System.out.println("Please enter firt name");
					contact.setFirstName(sc.next());
					System.out.println("pls enter last Name");
					contact.setLastName(sc.next());
					System.out.println("pls enter mobile Number");
					contact.setMobileNumber(sc.next());
					System.out.println("pls enter country");
					contact.setCountry(sc.next());
					System.out.println("plsenter Adress");
					contact.setAdress(sc.next());
					contacts.add(contact);
				
				}
				user.setContactList(contacts);
			}
			
			Contactobj.addUser(user);
			System.out.println("Data saved");
	}
	
	public void UpdateUser(int id) {
		
		User user=new User();
		Contactobj.updateUser(id);
		
	}
	public void deleteUser(int id) {
		
		User c1=new User();
		Contactobj.removeUser(id);
		
	}
	public void GetUser(int id ) {
		
		
		if(Contactobj.isaUser(id)) {
			
			
			int res=0;
			System.out.println("chose from the options");
			System.out.println("1 update userinfo");
			System.out.println("2 manage contact info");
			System.out.println("3 delte contact info");
			System.out.println("4 exit");
			res=sc.nextInt();
			if(res==1) {
				User user=new User();
			}else if(res==2) {
				
				int ans=0;
		        Scanner s=new Scanner(System.in);
		        while (ans!=5) {
		        	
		        	System.out.println( "pls select chose from the 5 options" );
		        	System.out.println( "1 for Insert" );
		        	System.out.println( "2 for Update" );
		        	System.out.println( "3 for Delete" );
		        	System.out.println( "4 for Retrive");
		        	System.out.println( "5 for Exit" );
		        	ans=s.nextInt();
		        	
		        	if(ans==1) {
		        		Contacts contact=new Contacts();
		    			List<Contacts> contacts=new ArrayList<Contacts>();
		        		System.out.println("pls enter number of contacts u wish to enter");
						noofcontact=sc.nextInt();
						for(int y=1; y<=noofcontact; y++)
						{
							System.out.println("Please enter firt name");
							contact.setFirstName(sc.next());
							System.out.println("pls enter last Name");
							contact.setLastName(sc.next());
							System.out.println("pls enter mobile Number");
							contact.setMobileNumber(sc.next());
							System.out.println("pls enter country");
							contact.setCountry(sc.next());
							System.out.println("pls enter Adress");
							contact.setAdress(sc.next());
							
						
						}
						Contactobj.addDetails(id, contact);
		        		
		        	}else if(ans==2) {
		        		System.out.println("pls enter enter firstname of contact  to be updated");
		        		String name=s.next();
		        		Contactobj.updateDetails(id, name );
		        		
		        	}else if(ans==3) {
		        		System.out.println("pls enter enter firstname of contact  to be deleted");
		        		String name=s.next();
		        		Contactobj.removeDetails(id, name );
		        		
		        	}else if(ans==4) {
			        	List<Contacts>	conlist=new ArrayList();
			        	conlist =Contactobj.getDetails(id);
			        	for(Contacts contact:conlist) {
							
							System.out.println("firt name: " + contact.getFirstName());
						
							System.out.println("last Name: " + contact.getLastName());
								
							System.out.println("mobile Number: " + contact.getMobileNumber());
							
							System.out.println("country: " + contact.getCountry() );
							
							System.out.println("Adress: " + contact.getAdress());
								
						}
			        	    		
		        	}else if(ans==5) {
		        		System.exit(0);
		        	}
		        	else {
		        		System.out.println( "  " );
		        	}
		        }	
			}else if (res==3){
				
				deleteUser(id);
				
			}else if(res==4) {
				System.exit(0);
			}else {
				System.out.println( "  " );
			}
			
			
		}
		
		
	}
	

}
