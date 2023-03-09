package oopstopic.abstopic;

public interface Vehicle 
{
//	1) Data Members---[constant variables]----[public static final]
	int SPEED=100;//[public static final]
//	2) abstract Member method----[public abstract]
	void getSpec();//[public abstract]
	
//	3) NonAbstract Methods:-
//	------------------------
//		---> static method[8]
	static void testStatic() 
	{
		System.out.println("Vehicle -- testStatic()");
	}
//		---> default method[8]
	default void testDefault() 
	{
		testPrivate() ;
		System.out.println("Vehicle  -- testDefault()");
	}
//		---> private method[9]
	private void testPrivate() 
	{
		System.out.println("Vehicle  -- testPrivate()");
	}
}