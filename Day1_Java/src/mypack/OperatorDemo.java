package mypack;

public class OperatorDemo {
	
	//operators
			//conditional operators 
			//=>,<<,>,<=
			//logical operators
	
	public static void main(String arg[]) {
		
		double salary = 40000.00;
		double intrestrate=7;
		double totalintrest=(salary*intrestrate)/100;
		System.out.println();
		int number1=35;
		int number2=50;
		int number3=45;
		System.out.println("Check number1 greater than number2 "+(number1>number2));
		System.out.println("checking another "+((number1>number2)&&(number1>number3)) );
		
	}

}
