package exceptiontopic.custom;

// User Defined Exception --- 1) checked / Unchecked
public class InvalidAgeException extends Exception
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
