package collectiontopic.settopic;
import java.util.TreeSet;
import java.util.Iterator;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeSet<String> namesSetObj = new TreeSet<String>();
		namesSetObj.add("rahul");//0
		namesSetObj.add("ankur");//1
		namesSetObj.add("krunal");//2
		namesSetObj.add("sagar");//3
		namesSetObj.add("ramesh");//4
		namesSetObj.add("brijesh");//5
		namesSetObj.add("krishna");//6
		namesSetObj.add("ankur");//7
		namesSetObj.add("krunal");//8
		namesSetObj.add("sagar");//9
		namesSetObj.add("ramesh");//10

		System.out.println("namesSetObj.size() - " + namesSetObj.size());
		Iterator<String> itr =	namesSetObj.iterator();
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
