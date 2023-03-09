package innerclasstopic.mi;

import innerclasstopic.mi.A.B;

// Outer Class
public class A 
{
	private int no = 10;
	// 1) Member--Inner Class	
	class B
	{
		void msg() 
		{
			System.out.println("B -- msg--- " + no);
		}
	}
	public static void main(String[] args) 
	{
		A objA = new A();
		
		A.B objB = objA. new B();
				
		objB.msg();
	}
}
