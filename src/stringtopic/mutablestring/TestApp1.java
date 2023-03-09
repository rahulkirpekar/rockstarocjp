package stringtopic.mutablestring;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		StringBuffer sb = new StringBuffer(sc.nextLine());
		System.out.println(sb + " - " + sb.hashCode());

		sb.append(" Technosoft");

		System.out.println(sb + " - " + sb.hashCode());
	}
}
