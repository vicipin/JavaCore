package accountdemo;

public class InvalidAmountException extends Exception {
	
	@Override	
	public String getMessage()
	{
		return "Trying to enter more than you have";
	}


}
