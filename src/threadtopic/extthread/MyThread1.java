package threadtopic.extthread;

public class MyThread1 extends Thread
{
	// thread---job----run method override
	@Override
	public void run() 
	{
		System.out.println("START :: run method");

		System.out.println("Hi, I am Thread. My Name is "+ Thread.currentThread().getName());
		
		System.out.println("EXIT :: run method");
	}
	public static void main(String[] args) 
	{
		System.out.println("START :: Main method");
		
		MyThread1 th1 = new MyThread1();
		th1.start();// run---defined job

		System.out.println("EXIT :: Main method");
	}
}
