package exception;

public class TaxNotEligibleException extends Exception {
	
	@Override	
	public String getMessage()
	{
		return "Tax not Eligible";
	}


}
