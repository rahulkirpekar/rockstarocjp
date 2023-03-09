package exceptiontopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no1,no2,ans=0;
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		no2 = sc.nextInt();

		String name = "Royal";

		String value = "12f3";
		try 
		{
			try 
			{
				// raise exception
				ans = no1/no2;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			try 
			{
				System.out.println("Lenght of Name : " + name.length());// NullPointerException
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			try 
			{
				int no = Integer.parseInt(value);
				System.out.println("No : " + no);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}

		}catch(ArithmeticException | NullPointerException | NumberFormatException  e) 
		{
			e.printStackTrace();
			System.out.println("ArithmeticException Block Handled - " + e.getClass().getName());
		}catch(Exception e) 
		{
			e.printStackTrace();
			System.out.println("Exception Block Handled - Exception");
		}
		
		
		System.out.println("Addition : " + ans);
	}
}
