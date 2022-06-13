package day2demo;

import java.util.Scanner;

public class Total_Even_Odd {
	
	public static void main(String[] args) {
		int totaleven=0;
		int totalodd=0;
		Scanner sc=new Scanner(System.in);
		for(int counter=0;counter<=9;counter++)
		{
			System.out.println("Enter Any number");
			int val=sc.nextInt();
			int chack=val%2;
			if(chack==0) {
				totaleven=totaleven+1;
			}
			else {
					totalodd=totalodd+1;
			}
		}
	
		System.out.println("Total even :"+totaleven);
		System.out.println("Total odd : "+totalodd);
		
	} 

}
