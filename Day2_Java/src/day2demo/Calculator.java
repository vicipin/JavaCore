package day2demo;

public class Calculator {
	
		//public means it can access anywhere
		//void return type
		//add method name
		public void add()
		{
			System.out.println("Adding Details ");
		}
		public void subtract()
		{
			System.out.println("Subtracting Details ");
		}
		public static void main(String[] args) {
			Calculator calobj;//Reference variable
			calobj=new Calculator();//I am initializing memory to this object
			calobj.add();
			calobj.subtract();//we are calling functionality of Calculator class
		}
}
