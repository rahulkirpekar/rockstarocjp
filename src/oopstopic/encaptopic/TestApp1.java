package oopstopic.encaptopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s  = new Student();
		
		s.setRno(1);
		s.setName("rahul");
		s.setStd(12);
		
		System.out.println(s.getRno()+ " "+ s.getName()+ " " + s.getStd());
	}
}
