package iotopic.udfobjecttopic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class TestApp 
{
	public static void main(String[] args) 
	{
		Student sobj = new Student(1, "rahul", 12);
		try 
		{
			FileOutputStream fout = new FileOutputStream("studentlist.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(sobj);
			out.close();
			fout.close();
			System.out.println("success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
