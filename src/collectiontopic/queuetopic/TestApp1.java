package collectiontopic.queuetopic;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> nameQueue = new PriorityQueue<String>();
		nameQueue.add("rakesh");
		nameQueue.add("ankur");
		nameQueue.add("ramesh");
		nameQueue.add("krunal");
		nameQueue.add("rahul");
		
		Iterator<String> itr =	nameQueue.iterator();
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
