package iotopic.stringtopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//Data ---String --- Read --- ByteOriented way
public class TestAppReadString 
{
	public static void main(String[] args) 
	{
		
		Object no = 10;
		
		if (no instanceof Integer) 
		{
			System.out.println("Hello : " + no);
			
		}
		
		
//		StringBuilder sb = new StringBuilder();
//		FileInputStream fin = null;
//		try 
//		{
//			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\rockstarocjp\\Byteorientedway.txt");
//			int temp;
//			while(	(temp = fin.read())	 != -1) 
//			{
//				sb.append((char)temp);
//			}
//			fin.close();
//		} catch (FileNotFoundException e) 
//		{
//			e.printStackTrace();
//		} catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
//		System.out.println("Final String Data from File : " + sb);
	}
}
