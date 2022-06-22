package assignment2;

import java.util.Scanner;


public class GradeMain {
	
public static void main(String[] arg) {
		
		
		Scanner s1 =new Scanner(System.in);
		Scanner s2 =new Scanner(System.in);
		
		int response=1;
		Grade grade;
		int score=0;
		
		while(response==1) {
			
			System.out.println("pls enter score");
			score=s1.nextInt();
			grade=new Grade(score);
			System.out.println("enter 1 to continue 0 to quit ");
			response=s2.nextInt();
		}
		
	}

}
