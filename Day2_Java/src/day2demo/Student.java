package day2demo;

import java.util.*;

public class Student {
	
	private int studentid;//can be access only in same class.
	private String studentname;
	private int score;
	private Scanner sc;
	public void accept()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter Student id ");
		studentid=sc.nextInt();
		System.out.println("Enter Student name ");
		studentname=sc.next();
		System.out.println("Enter Score ");
		score=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Student id is "+studentid);
		System.out.println("Student name is "+studentname);
		System.out.println("Score is :  "+score);
	}
	
	public static void main(String[] args) {
		Student stobj=new Student();
		stobj.accept();
		stobj.display();
	}

}
