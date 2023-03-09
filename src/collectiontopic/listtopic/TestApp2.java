package collectiontopic.listtopic;
import java.util.Iterator;
import java.util.LinkedList;
public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s1=  new Student(1, "rahul", 12);
		Student s2=  new Student(2 ,"krunal", 12);
		Student s3=  new Student(3, "ankur", 12);
		Student s4=  new Student(4, "ramesh", 12);
		Student s5=  new Student(5, "sagar", 12);
		LinkedList<Student> list = new LinkedList<Student>();
		list.add(s1);//<===itr
		list.add(s2);		
		list.add(s3);		
		list.add(s4);
		list.add(s5);
		System.out.println("list.size() - " + list.size());
		Iterator<Student> itr=	list.iterator();

		while(itr.hasNext()) 
		{
			Student s = itr.next();
			s.disp();
		}
	}
}