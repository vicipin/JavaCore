package day2demo;
import java.util.*;
public class SwitchDemo {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number -----");
		int x=sc.nextInt();
		switch(x)
		{
		case 5:
				System.out.println("This is number 5");
				break;
		case 10:
				System.out.println("This is Number 10");
				break;
		default:
				System.out.println("This is default one");
		
		}
		
	}

}
