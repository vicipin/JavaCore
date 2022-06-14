package percentage_of_m;
import java.util.*;

public class A extends Marks {
	

	
	private double mark1;
	private double mark2;
	private double mark3;
	
	public A(double mark1, double mark2, double mark3) {
		super();
		
		
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
				
		getPercentage();
		
		
		
	}
	
	
	
	@Override
	public void getPercentage() {
		
		double total=mark1+mark2+mark3;
		
		double average=(total/3);
		System.out.println("The Avrage is  " + average);
			
		
	}
	

}
