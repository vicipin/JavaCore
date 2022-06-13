package mypack;

import java.util.Scanner;

public class Question4 {
	
	public static void main(String args[]){
		
		
		String name;
		String rollnumber;
		String fieldofintrest;
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter name");
		name=sc1.next();
		
		System.out.println("Enter roll number");
		rollnumber=sc1.next();
		
		System.out.println("Enter field of intrest");
		fieldofintrest=sc1.next();
		
		System.out.println("hey my name is " + name + " " +"my rollnumber is  " + rollnumber + " " + "myfield of intrest is" + fieldofintrest);
		
	}
	

}
