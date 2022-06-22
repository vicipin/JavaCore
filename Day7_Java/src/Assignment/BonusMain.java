package Assignment;
import java.util.*;

public class BonusMain {
	
	public static void main(String[] arg) {
		
		Scanner s =new Scanner(System.in);
		Scanner s1 =new Scanner(System.in);
		Scanner s2 =new Scanner(System.in);
		double netBonus;
		int response=1;
		Bonus bonus;
		int year=0;
		double salary=0;
		while(response==1) {
			
			System.out.println("pls enter salary");
			salary=s.nextDouble();
			System.out.println("pls enter years of service");
			year=s1.nextInt();
			bonus=new Bonus(salary,year);
			netBonus=bonus.getBonus();
			System.out.println("your net bonus is " + netBonus);
			System.out.println("enter 1 to continue 0 to quit ");
			response=s2.nextInt();
		}
		
	}

}
