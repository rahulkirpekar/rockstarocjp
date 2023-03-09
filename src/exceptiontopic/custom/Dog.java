package exceptiontopic.custom;

public class Dog extends Animal
{
	@Override
	public void eat() // throws Exception 
	{
		System.out.println("Dog--eat()");
	}
}
