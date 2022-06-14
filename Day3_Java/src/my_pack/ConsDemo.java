package my_pack;

public class ConsDemo {
	
	int x;
	int y;
	public ConsDemo()
	{
		System.out.println("Constructor called");
		x=70;
		y=30;
	}
	public ConsDemo(int x,int y)
	{
		System.out.println("Calling parameterized constructor");
		this.x=x;//initializing instance variable with parameter
		this.y=y;
		
	}
	public void add()
	{
		int total=x+y;
		System.out.println("Total is    "+total);
				
	}
	public void subtract()
	{
		int difference=x-y;
		System.out.println("Difference is "+difference);
				
	}
	public static void main(String[] args) {
		ConsDemo c1=new ConsDemo();
		c1.add();
		c1.subtract();
		ConsDemo c2=new ConsDemo(100,20);
		c2.add();
		c2.subtract();
	}
	

}
