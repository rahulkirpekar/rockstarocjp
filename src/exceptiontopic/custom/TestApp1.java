package exceptiontopic.custom;

import java.io.IOException;

public class TestApp1 
{
	public static void isValidForVote(int age) throws InvalidAgeException
	{
		if (age < 18) 
		{
			// raise exception
			throw new InvalidAgeException("Invalid Age, Please enter above 18 age");
		} else 
		{
			System.out.println("Welcome For Vote");
		} 
	}
	public static void main(String[] args) 
	{
		try 
		{
			isValidForVote(10);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("After catch block");
	}
}
