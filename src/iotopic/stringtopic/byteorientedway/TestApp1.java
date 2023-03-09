package iotopic.stringtopic.byteorientedway;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\rockstarocjp\\src\\iotopic\\stringtopic\\byteorientedway\\TestAppReadString.java");
			FileOutputStream fout = new FileOutputStream("TestAppReadStringDup.java");
			int temp;
			while(	(temp = fin.read())	!= -1) 
			{
//				System.out.print((char)temp);
				fout.write(temp);
			}
			fin.close();
			fout.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
