package collectiontopic.maptopic;

import java.util.TreeMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// TreeMap --- [Key,Value]
		TreeMap<Integer,String> mapObj = new TreeMap<Integer,String>();
		
		mapObj.put(3, "rakesh");
		mapObj.put(1, "rahul");// Entry--[Key,Value]
		mapObj.put(5, "brijesh");
		mapObj.put(2, "ankur");
		mapObj.put(4, "sagar");
		
		for(Map.Entry<Integer, String> e  : mapObj.entrySet()) 
		{
			System.out.println(e.getKey() + " " +e.getValue());
		}
	}
}
