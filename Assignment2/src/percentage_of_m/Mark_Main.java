package percentage_of_m;

import java.util.Scanner;

public class Mark_Main {

	public static void main(String args[]) {
		
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		Scanner s3=new Scanner(System.in);
		
		Scanner sS=new Scanner(System.in);
		Scanner sI=new Scanner(System.in);
		
		int num=1;
		while(num==1) {
			System.out.println("pls enter (A) for student (A) or B for student B ");
			String Student=sS.next();
			
			if (Student.equals("A")) {
			
				
				double mark1;
				double mark2;
				double mark3;
				
				System.out.println("pls enter mark1 ");
				mark1=s.nextDouble();
				System.out.println("pls enter mark2 ");
				mark2=s.nextDouble();
				System.out.println("pls enter mark3 ");
				mark3=s.nextDouble();
				
				A a=new A(mark1, mark2, mark3);
				
			}else {
				
				double mark1;
				double mark2;
				double mark3;
				double mark4;
				
				System.out.println("pls enter mark1 ");
				mark1=s.nextDouble();
				System.out.println("pls enter mark2 ");
				mark2=s1.nextDouble();
				System.out.println("pls enter mark3 ");
				mark3=s2.nextDouble();
				System.out.println("pls enter mark4 ");
				mark4=s3.nextDouble();
				
				
				B b=new B(mark1, mark2, mark3,mark4);
					
			}
			
			System.out.println("pls enter 1 to continue and 0 to quit ");
			num=sI.nextInt();
		}
	}
	
}
