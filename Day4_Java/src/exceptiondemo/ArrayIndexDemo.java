package exceptiondemo;

public class ArrayIndexDemo {
	
	private int arr[];
	public ArrayIndexDemo()
	{
		arr=new int[] {34,23,23,12,43};
	}
	public void display()
	{
		try
		{
		for(int x=0;x<=arr.length;x++)
		{
			
			
			System.out.println("Value of array is "+arr[x]);
			
		}
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Trying to access beyond limit");
		}
	}
	public static void main(String[] args) {
		ArrayIndexDemo arrindex=new ArrayIndexDemo();
		arrindex.display();
	}

}
