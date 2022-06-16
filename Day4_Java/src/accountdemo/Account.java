package accountdemo;



public class Account {
	
	public void withdraw (double amount){
		
		double balance=100;
		
		try {
			
			if (amount>balance) {
				
				throw new InvalidAmountException();
				
			}
			
		}catch(InvalidAmountException ex) {
			
			System.out.println(ex.getMessage());
			
		}
		
	}

}
