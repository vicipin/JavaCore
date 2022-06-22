package wait_notify;

public class Account {
	
	double balance=40000;
	public synchronized void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("Amount cannot be greater than balance");
			try {
				System.out.println("Waiting for resource ");

				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		balance=balance-amount;
		System.out.println("Updated balance is "+balance);
		
	}
	public synchronized void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("balance after deposit is "+balance);
		notify();
	}

}
