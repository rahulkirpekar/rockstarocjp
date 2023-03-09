package oopstopic.polymorphismtopics.rp;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Vehicle vehicle = new TwUser();
		
		vehicle.getSpec();
		
		( (TwUser)vehicle).getTwVehicleParts();
		
//		TwUser twUser = (TwUser)vehicle;
//		twUser.getTwVehicleParts();
	}
}
