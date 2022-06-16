package mypack.runnable;

public class TableThread1 extends Thread {
	private Table obj;
	public TableThread1(Table obj)
	{
		this.obj=obj;
		
		
	}
	public void run()
	{
		obj.printTable(5);
	}

}
