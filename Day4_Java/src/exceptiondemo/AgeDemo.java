package exceptiondemo;
import java.util.*;


public class AgeDemo {
	
	private Scanner sc;
	public AgeDemo()
	{
		sc=new Scanner(System.in);
	}
	public void checkAge()
	{
		System.out.println("Enter Age");
		int age=sc.nextInt();
		try
		{
		if(age<18)
		{
			throw new InvalidAgeException();
		}
		}
		catch(InvalidAgeException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String[] args) {
		AgeDemo age=new AgeDemo();
		age.checkAge();
	}
	

}
