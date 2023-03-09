package iotopic.doubts;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s = new Student(1, "rahul ", 12);
		try 
		{
			FileOutputStream fout = new FileOutputStream("rockstar.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s);
			
			out.close();
			
			fout.close();
			
			System.out.println("Success");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
