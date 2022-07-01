package mydemo.hiber.StudentManageHiber;

import mydemo.hiber.StudentManageHiber.service.StudentService;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StudentService studentservice=new StudentService();
    	
    	
    	int ans=0;
        Scanner s=new Scanner(System.in);
        while (ans!=5) {
        	
        	System.out.println( "pls select chose from the 5 options" );
        	System.out.println( "1 for Insert" );
        	System.out.println( "2 for Update" );
        	System.out.println( "3 for Delete" );
        	System.out.println( "4 for Retrive" );
        	System.out.println( "5 for Exit" );
        	ans=s.nextInt();
        	
        	if(ans==1) {
        		
        		studentservice.insertData();
        		
        	}else if(ans==2) {
        		
        		studentservice.updateData();
        		
        	}else if(ans==3) {
        		studentservice.delete();
        		
        	}else if(ans==4) {
        		studentservice.retreive();
        		
        	}else if(ans==5) {
        		System.exit(0);
        	}
        	else {
        		System.out.println( "  " );
        	}
        }
    	
    
    }
}
