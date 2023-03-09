package iotopic.doubts;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\rockstarocjp\\rockstar.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Object obj = oin.readObject();
			Student s = (Student)obj;
			s.disp();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
