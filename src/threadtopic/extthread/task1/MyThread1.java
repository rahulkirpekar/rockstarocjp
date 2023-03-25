package threadtopic.extthread.task1;

public class MyThread1 extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 1; i<=30; i++) 
		{
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i + "---"+ Thread.currentThread().getId() + "---" + Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) 
	{
		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();
		MyThread1 t3 = new MyThread1();
		
		t1.start();
		t2.start();
		t3.start();
	}
}
