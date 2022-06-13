package my_pack;
import java.util.*;

public class AreaCalculator {
	
	public static void calculateShapeArea (int side, double length) {
		
		
		switch(side)
		{
		case 1:
				Circle area=new Circle();
				double Area=area.ACircle(length);
				System.out.println("The Area of  the  Circle  is  " + Area);
				break;
		case 3:
				Triangle area1=new Triangle();
				double Area1=area1.ATriangle(length);
				System.out.println("The Area of  the  Triangle  is  " + Area1 );
				break;
		case 4:
				Square area2=new Square();
				double Area2=area2.ASquare(length);
				System.out.println("The Area of  the  Square  is  " + Area2);
				break;
		default:
				System.out.println("No Shapes Present");
		
		}
	}
	
	public static void main(String args[]) {
		
		int num=1;
		
		while(num==1) {
		int side;
		double length;
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);
		
		System.out.println("Enter Any Number of Sides");
		side=sc.nextInt();
		System.out.println("Enter Any Side length");
		length=sc2.nextDouble();
		calculateShapeArea (side,length);
		System.out.println("if u wish to continue enter 1, or 0 to quit");
		num=sc3.nextInt();
		
		}
		
	}
	


}
