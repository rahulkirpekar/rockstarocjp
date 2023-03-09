package innerclasstopic.li;
public class A 
{
	private int no = 100;
	public void disp() 
	{
		// Local Inner Class
		class B
		{
			void show() 
			{
				System.out.println("NO : " + no);
			}
		}
		B obj = new B();
		obj.show();
	}
	public static void main(String[] args) 
	{
		A obj = new A();
		obj.disp();
	}
}
