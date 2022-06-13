package mypack;

import java .util.Scanner;

public class Area {
	
	public static void main(String args[]){
		
		
		int length;
		int width;
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter length");
		length=sc1.nextInt();
		
		System.out.println("Enter Width");
		width=sc1.nextInt();
		
		int area =(length*width);
		
		System.out.println("Area is ---  " + area);
		
	}

}
