package wait_notify;

public class ThreadAccount2 extends Thread {
	
	private Account ac1;
	
	public ThreadAccount2(Account ac1)
	{
		this.ac1=ac1;
	}
	public void run()
	{
		ac1.withdraw(60000);
	}





}
