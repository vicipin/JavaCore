package day2demo;
import java.util.*;
public class ArrayDemo {
	
	public static void main(String[] args) {
		int number[];
		number=new int[10];
		Scanner sc=new Scanner(System.in);
		int totaleven=0;
		int totalodd=0;
		for(int x=0;x<number.length;x++)
		{
			System.out.println("Enter Any Number");
			number[x]=sc.nextInt();
			if(number[x]%2==0)
			{
				totaleven=totaleven+1;
				
			}
			else
			{
				totalodd=totalodd+1;
				
			}
		}
		System.out.println("Total even numbers are "+totaleven);
		System.out.println("Total odd numbers are "+totalodd);
	}
	

}
