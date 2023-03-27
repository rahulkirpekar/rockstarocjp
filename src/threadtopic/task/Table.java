package threadtopic.task;
public class Table 
{
	// synchronized - ThreadSafe
	public void printTable(int no) 
	{
		synchronized (this) 
		{
			for (int i = 1; i <=10; i++) 
			{
				try 
				{
					Thread.sleep(500);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				System.out.println(	Thread.currentThread().getName() +"---"+ Thread.currentThread().getId() +"---"+no + " " +i + " " +(no*i));
			}
		}
	}
}