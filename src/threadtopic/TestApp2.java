package threadtopic;

public class TestApp2 extends Thread
{
	Table t= null;
	
	public TestApp2(Table t) 
	{
		this.t=t;
	}
	@Override
	public void run() 
	{
		t.printTable(10);
	}
}
