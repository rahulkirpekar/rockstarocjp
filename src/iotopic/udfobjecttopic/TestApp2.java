package iotopic.udfobjecttopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

interface A
{
	void add();
}
public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\rockstarocjp\\studentlist.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
			Student s = (Student)oin.readObject();
			System.out.println("s obj - " + s);
			s.disp();
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
