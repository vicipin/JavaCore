package day2demo.mypackage;
import java.util.*;

public class CalculatorMain {
	
	private Scanner sc;
	private Calculator calc[];
	private int number_of_student;
	
	public void array_of_hight_obj() {
		
		sc=new Scanner(System.in);
		System.out.println("pls enter number students");
		
		number_of_student=sc.nextInt();
		calc=new Calculator[number_of_student];
		
		
		for(int x=0;x<calc.length;x++){
			Calculator s=new Calculator();
			System.out.println("Enter student hight id ");
			s.sethight(sc.nextInt());
			
			
		}
	}
	
	public void average()
	
	{
		double total;
		
		for(int x=0;x<calc.length;x++)
		{
			
			
		}
		
		System.out.println("Employee id is "+emparr[x].getEmpid());
	}
	

}
