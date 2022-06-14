package in_class_assignment2;

public class Bank_A extends Bank {

	
	private int balance=100;
	
	@Override
	public void getBalance(int balance) {
		
		this.balance=balance;
		
		System.out.println("Balance "+ balance);
		
		
	}
}
