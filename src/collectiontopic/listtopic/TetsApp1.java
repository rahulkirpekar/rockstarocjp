package collectiontopic.listtopic;
import java.util.ArrayList;
public class TetsApp1 
{
	public static void main(String[] args) 
	{
		Student s  = new Student();//(1, "rahul", 12);
		ArrayList listObj = new ArrayList();
		listObj.add(true);//0--- boolean---Boolean--object
		listObj.add('R');//1--- char---Character--Object
		listObj.add(10);//2--- int---Integer--Object
		listObj.add(2134L);//3--- long---Long--Object
		listObj.add(4.435f);//4--- float---Float --object
		listObj.add(234.345);//5--- double--Double---Object
		listObj.add("royal");//6--- String object
		listObj.add(s);//7--- User Defined obj
		// total --8
		System.out.println("listobj.size() -- "+listObj.size());
		for (int i = 0; i < listObj.size(); i++) 
		{
			System.out.println("listObj.get("+i+") - "+listObj.get(i));
		}
	}
}
