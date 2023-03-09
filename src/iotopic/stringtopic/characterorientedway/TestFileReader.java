package iotopic.stringtopic.characterorientedway;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TestFileReader 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new  StringBuilder();
		try 
		{
			FileReader fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\rockstarocjp\\brijeshdata.txt");
			int temp;
			while((temp = fr.read()) != -1) 
			{
				sb.append((char)temp);
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final String : " + sb);
	}
}
