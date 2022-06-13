package day2demo;
import java.util.Scanner;
	
	
public class SumNumbers {
	
	public static void main(String[] args) {
		int total=0;
		Scanner sc=new Scanner(System.in);
		for(int counter=1;counter<=5;counter++)
		{
			System.out.println("Enter Any number");
			int val=sc.nextInt();
			total=total+val;
		}
		System.out.println("Total is   :"+total);
		
	}


}
