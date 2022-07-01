package mypackage;

public class HelloLambdaInter {
	
	public void display()
	{
		HelloWorldInter hellointer=(s)->{
			System.out.println("Stirng passed by user is "+s);
			
		};
		hellointer.show("Welcome To lambda");
	}
	public static void main(String[] args) {
		HelloLambdaInter hellointer=new HelloLambdaInter();
		hellointer.display();
	}

}
