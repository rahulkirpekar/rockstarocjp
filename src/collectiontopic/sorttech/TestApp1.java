package collectiontopic.sorttech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		Iterator<Integer> itr =	list.iterator();
		while(itr.hasNext()) 
		{
			int no = itr.next();
			System.out.println(no);
		}

		Collections.sort(list);
		System.out.println("After Sorting : ");
		
		itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			int no = itr.next();
			System.out.println(no);
		}
	}
}
