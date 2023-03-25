package threadtopic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Table resource = new Table();
		
		TestApp2 th1 = new TestApp2(resource);
		TestApp2 th2 = new TestApp2(resource);
		
		th1.start();
		th2.start();
		
	}
}
