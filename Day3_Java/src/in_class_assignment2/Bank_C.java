package in_class_assignment2;

public class Bank_C extends Bank {
	
	
	private int balance=200;
	
	@Override
	public void getBalance(int balance) {
		
		this.balance=balance;
		
		System.out.println("Balance "+ balance);
		
	}

}
