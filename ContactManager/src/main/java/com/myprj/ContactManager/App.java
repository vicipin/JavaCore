package com.myprj.ContactManager;

import java.util.Scanner;

import com.myprj.ContactManager.service.ContactService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	UserMenu();
    	
    }
    
  
    
    public static void UserMenu() {
    	ContactService contactservice=new ContactService();
    	int ans=0;
        Scanner s=new Scanner(System.in);
        while (ans!=3) {
        	
        	System.out.println( "pls select chose from the 3 options" );
        	System.out.println( "1 for new User" );
        	System.out.println( "2 for Existing User" );
        	System.out.println( "3 for exit" );
        	ans=s.nextInt();
        	
        	if(ans==1) {
        		
        		contactservice.CreateNew_USer();
        		
        		
        	}else if(ans==2) {
        		System.out.println( "pls enter user id" );
        		int userid=s.nextInt();
        		contactservice.GetUser(userid);;
        		
        	}else if(ans==3) {
        		System.exit(0);
        	}
        	else {
        		System.out.println( "  " );
        	}
        }
    }
    
  
    
}
