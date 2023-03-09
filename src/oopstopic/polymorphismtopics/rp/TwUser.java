package oopstopic.polymorphismtopics.rp;

public class TwUser extends Vehicle
{
	@Override
	void getSpec() 
	{
		System.out.println("TwUser---getSpec()");
	}
	void getTwVehicleParts() 
	{
		System.out.println("TwUser---getTwVehicleParts()");
	}
}
