package account;


public class Athread extends Thread {
	
	
	
	public void run()
	{
		
		Account account=new Account();
		for(int amount =1; amount<=51; amount++ )
		{
			try {
				System.out.println("amount entred  " + amount);
				account.withdraw(amount);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
