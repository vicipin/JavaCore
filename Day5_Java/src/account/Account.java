package account;

public class Account {
	
	
	public synchronized void withdraw(int amount){
		
		int balance=1000;
		
		if (amount > balance ) {
			
			System.out.println("you dont have that much money ");
		}else {
			balance=balance-amount;
			System.out.println("you have withdran "+ amount +" your new balance is " + balance);
		}
		
		
		
	}

}
