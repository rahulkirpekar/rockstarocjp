package iotopic.udfobjecttopic;

import java.io.Serializable;
import java.util.Scanner;

// Serializable - Marker Interface-----X
public class Student implements Serializable
{
	int rno;
	String name;
	int std;

	public Student() 
	{
	}
	public void disp() 
	{
		System.out.println(rno + " "+ name + " "+ std);
	}
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
}
