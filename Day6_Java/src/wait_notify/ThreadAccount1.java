package wait_notify;


public class ThreadAccount1 extends Thread{
	
	private Account ac;
	public ThreadAccount1(Account ac)
	{
		this.ac=ac;
	}
	public void run()
	{
		ac.deposit(50000);
	}

}