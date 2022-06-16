package exceptiondemo;

import java.util.Scanner;

public class NumberFormat {
	
public static void main(String args[]) {
		
		
	
		try {

			Scanner sc=new Scanner(System.in);
			Scanner sc2=new Scanner(System.in);
			
			int num1;
			int num2;
			
			System.out.println("pls enter num 1");
			num1=sc.nextInt();
			System.out.println("pls enter num 2");
			num2=sc2.nextInt();
			
			add(num1,num2);
			
		}
		catch(NumberFormatException e){
			System.out.print("You did not enter an integer");
		}
		
		
	}
	
	public static int add(int num1, int num2) {
		
		int added=0;
		added=num1+num2;
		return added;
	}


}
