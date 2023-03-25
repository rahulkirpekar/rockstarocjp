package threadtopic;

public class TestApp1 
{
	// main -- Thread ---CALL STACK---Execution Area
	public static void main(String[] args) 
	{
		System.out.println("Thread.currentThread().getName() - " + Thread.currentThread().getName());
		System.out.println("Statement-----1");
		System.out.println("Statement-----2");
		System.out.println("Statement-----3");
		System.out.println("Statement-----4");
		System.out.println("Statement-----5");
	}
}
