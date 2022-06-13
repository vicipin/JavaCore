package mypack;
import java.util.Scanner;

public class AgeDemo {
	
	public static void main(String arg[]) {
		
		String name;
		int age;
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter Name of user");
		name=sc1.next();
		
		System.out.println("Enter Age of user");
		age=sc1.nextInt();
		
		if(age>18)
		{
			System.out.println("Valid age "+name);
		}
		else
		{
			System.out.println(name+"Not allow to enter in system");
		}
		
	} 

}
