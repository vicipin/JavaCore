package exceptiondemo;
import java.util.*;

public class ArithDemo {
	
	private Scanner sc;
	int num1,num2;
	public ArithDemo()
	{
		sc=new Scanner(System.in);
	}
	public void accept()
	{
		System.out.println("Enter Number 1");
		num1=sc.nextInt();
		System.out.println("Enter Number 2");
		num2=sc.nextInt();
	}
	public void calculate()
	{
		try
		{
		double result=num1/num2;
		System.out.println("Result is "+result);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Trying to divide number by zero");
			
		}
		System.out.println("Welcome to my application");
	}
	public static void main(String[] args) {
		ArithDemo arith=new ArithDemo();
		arith.accept();
		arith.calculate();
	}

}
