package calc;
import java.util.*;
import mypackage.HelloWorldInter;

public class Calculation {
	
	Calculator calculator=(n1,n2)->{
		
		 return(n1+n2);
	};
	
	
	public static void main(String[] args) {
			
		Calculation cal=new Calculation();
		System.out.println(cal.calculator.calculate(4,6));
		
	}

}
