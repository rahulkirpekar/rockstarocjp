package threadtopic.task;
public class Table 
{
	public void printTable(int no) 
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