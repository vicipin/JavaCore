package exceptiondemo;

public class InvalidAgeException extends Exception {
	@Override	
	public String getMessage()
	{
		return "Trying to enter Invalid Age";
	}

}
