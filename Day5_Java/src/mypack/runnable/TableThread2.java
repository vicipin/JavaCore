package mypack.runnable;

public class TableThread2 extends Thread{
	
	private Table obj;
	public TableThread2(Table obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.printTable(30);
	}

}
