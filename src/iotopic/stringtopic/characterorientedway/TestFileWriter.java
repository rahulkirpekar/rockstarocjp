package iotopic.stringtopic.characterorientedway;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TestFileWriter 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Name : ");
		String name = new Scanner(System.in).nextLine();
		try 
		{
			FileWriter fw = new FileWriter("brijeshdata.txt");
			fw.write(name);
			fw.close();
			System.out.println("Success");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
