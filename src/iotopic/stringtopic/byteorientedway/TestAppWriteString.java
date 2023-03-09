package iotopic.stringtopic.byteorientedway;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
// Data ---String --- Write --- ByteOriented way
public class TestAppWriteString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		byte b[] = name.getBytes();
		FileOutputStream fout = null;
		try 
		{
			fout = new FileOutputStream("Byteorientedway.txt");
			fout.write(b);
			fout.close();
			System.out.println("Successsfully :---Writting String Data into File.");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}









