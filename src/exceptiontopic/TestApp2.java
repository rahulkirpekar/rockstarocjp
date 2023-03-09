package exceptiontopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		String name = null;
		try 
		{
			System.out.println("Lenght of Name : " + name.length());// NullPointerException
			
		} catch (ArithmeticException e) 
		{
			System.out.println("ArithmeticException Handled By Catch Block");
		}
		System.out.println("After Catch Block");
	}
}
