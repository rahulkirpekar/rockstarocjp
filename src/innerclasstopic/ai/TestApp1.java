package innerclasstopic.ai;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		A obj = new A() 
		{ // ---TestApp1$1
			@Override
			public void add() 
			{
				System.out.println("A -- add()---" + this);
			}
		};
		obj.add();
	}
}
