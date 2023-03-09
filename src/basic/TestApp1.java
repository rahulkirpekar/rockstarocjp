package basic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float a[] = new float[5];

		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+i+"] : ");
			a[i] = sc.nextFloat();
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("A["+i+"] : " + a[i] );
		}
	}
}
