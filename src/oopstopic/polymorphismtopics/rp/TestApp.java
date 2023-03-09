package oopstopic.polymorphismtopics.rp;

public class TestApp 
{
	public static void main(String[] args) 
	{
		// Runtime 
		// Late Binding
		// Dynamic Binding 
		Vehicle vechile = new TwUser();
		vechile.getSpec();
		
		vechile = new LmvUser();
		vechile.getSpec();
		
		vechile = new HmvUser();
		vechile.getSpec();
	}
}
