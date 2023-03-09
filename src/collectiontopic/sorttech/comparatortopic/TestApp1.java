package collectiontopic.sorttech.comparatortopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12, 78);
		Student s2 = new Student(2, "sagar", 11, 67);
		Student s3 = new Student(3, "tejas", 10, 45);
		Student s4 = new Student(4, "brijesh", 9, 57);
		Student s5 = new Student(5, "kunal", 8, 42);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Iterator<Student> itr =	list.iterator();
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			s.disp();
		}
		System.out.println("After Markswise Sorting : ");
		Collections.sort(list, new MarksWiseStudentComparator());	
		itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			s.disp();
		}
		System.out.println("After Namewise Sorting : ");
		Collections.sort(list, new NameWiseStudentComparator());	
		itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			s.disp();
		}
		System.out.println("After Stdwise Sorting : ");
		Collections.sort(list, new StdWiseStudentComparator());	
		itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			s.disp();
		}
		
		
	}
}