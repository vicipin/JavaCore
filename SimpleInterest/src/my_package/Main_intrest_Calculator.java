package my_package;

import java.util.*;

public class Main_intrest_Calculator {
	
	
	public static void main(String args[]) {
		
		SimpleInterestCalculator calc=new SimpleInterestCalculator();
		Scanner s=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		Scanner s3=new Scanner(System.in);
		int res=1;
		double P;
		int N;
		double iNtrest;
		
		while(res==1) {
			
			System.out.println("Pls Enter the number of years");
			N=s.nextInt();
			
			System.out.println("pls Enter the principal");
			P=s2.nextDouble();
			
			iNtrest=calc.calculateSimpleInterest(N, P);
			
			System.out.println("The interest amount for a principal "+ P + " and years " + N + " is " + iNtrest);
			
			System.out.println("Would you like to continue, enter 1 or enter 0 to quit");
			res=s3.nextInt();
			
			
			
		}
		
	}

}
