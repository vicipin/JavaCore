package mypack.runnable;

public class Table {
	
	public synchronized void printTable(int number)
	{
		for(int x=1;x<=10;x++)
		{
			
		
		System.out.println(number+"* "+x+" = "+(number*x));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

}
