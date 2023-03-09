package oopstopic.finaltopic;

public class TestApp1 
{
	// Data Member
	final int no;
	
	public TestApp1() 
	{
		no = 100;
	}
	public TestApp1(int no) 
	{
		this.no = no;
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1(324);
		System.out.println("obj.no : " + obj.no);

	}
}
