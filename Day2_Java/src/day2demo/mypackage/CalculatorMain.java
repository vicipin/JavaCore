package day2demo.mypackage;
import java.util.*;

public class CalculatorMain {
	
	
	public  static Calculator calc[];
	
	public static void array_of_hight_obj() {
		Scanner sc;
		
		int  number_of_student;
		
		sc=new Scanner(System.in);
		System.out.println("pls enter number students");
		
		number_of_student=sc.nextInt();
		calc=new Calculator[number_of_student];
		
		
		for(int x=0;x<calc.length;x++){
			Calculator s=new Calculator();
			System.out.println("Enter student hight id ");
			s.sethight(sc.nextInt());
			calc[x]=s;
			
			
		}
	}
	
	public static void average()
	
	{
		double total=0;
		
		for(int x=0;x<calc.length;x++)
		{
			total= total+calc[x].gethight();
			
		}
		
		double average =total/calc.length;
		
		System.out.println("Avarge is " + average);
	}
	
	
	public static void main(String args[]) {
		
		array_of_hight_obj();
		average();
		
	}
	

}
