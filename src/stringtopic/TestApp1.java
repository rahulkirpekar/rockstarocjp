package stringtopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name1 = "royal";
		String name2 = "royal";
		String name3 = "techno";
		
		System.out.println(name1 + " - " +name1.hashCode());
		System.out.println(name2 + " - " +name2.hashCode());
		System.out.println(name3 + " - " +name3.hashCode());
		
// Object Equality		
		// 1) references --- [==]
		System.out.println("(name1==name2) - " + (name1==name2));
		System.out.println("(name1==name3) - " + (name1==name3));
		
		// 2) By values---string objects---equals---values
		System.out.println("(name1.equals(name2)) - " + (name1.equals(name2)));
		System.out.println("(name1.equals(name3)) - " + (name1.equals(name3)));
		
		
	}
}
