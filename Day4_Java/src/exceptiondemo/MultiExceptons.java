package exceptiondemo;
import java.util.*;

public class MultiExceptons {
	private Scanner sc;
	int arr[];
	public MultiExceptons()
	{
		sc=new Scanner(System.in);
		arr=new int[5];		
		
	}
	public void accept()
	{
		for(int x=0;x<arr.length;x++)
		{
			System.out.println("Enter any number ");
			arr[x]=sc.nextInt();
		}
	}
	public void divide()
	{
		try
		{
		System.out.println("Enter the index number for first no");
		int index1=sc.nextInt();
		System.out.println("Enter index number for second no");
		int index2=sc.nextInt();
		double result=arr[index1]/arr[index2];
		System.out.println("Result is "+result);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Trying to divide no by zero");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Accessing element beyond limit");
		}
	}
	public static void main(String[] args) {
		MultiExceptons multi=new MultiExceptons();
		multi.accept();
		multi.divide();
	}
	

}
