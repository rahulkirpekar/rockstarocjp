package iotopic.doubts;

import java.io.Serializable;

public class Student implements Serializable
{
	int rno;
	String name;
	int std;
	
	public Student(int rno, String name, int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public void disp() 
	{
		System.out.println(rno + " "+ name + " "+ std);
	}
}
