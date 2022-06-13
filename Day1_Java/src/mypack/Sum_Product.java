package mypack;

import java.util.Scanner;

public class Sum_Product {
	
	public static void main(String args[]){
			
			
			int a;
			int b;
			Scanner sc1=new Scanner(System.in);
			
			System.out.println("Enter a");
			a=sc1.nextInt();
			
			System.out.println("Enter a");
			b=sc1.nextInt();
			
			int product =(a*b);
			int sum =(a+b);
			
			System.out.println("Product is " + product + " "+"Sum is  " +sum);
			
		}

}
