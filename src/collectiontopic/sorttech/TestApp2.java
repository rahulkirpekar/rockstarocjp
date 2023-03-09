package collectiontopic.sorttech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("rahul");
		list.add("ankur");
		list.add("rakesh");
		list.add("ramesh");
		list.add("brijesh");
		list.add("vraj");
		
		Iterator<String> itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
		
		
		Collections.sort(list);
		System.out.println("After NameWise Sorting : ");
		
		itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
		
	}
}
