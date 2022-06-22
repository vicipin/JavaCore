package exception;

public class EmployeeNameInvalidException extends Exception {
	
	@Override	
	public String getMessage()
	{
		return "Employee name is Invalid";
	}

}
