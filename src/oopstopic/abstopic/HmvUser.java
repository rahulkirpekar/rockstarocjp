package oopstopic.abstopic;

public class HmvUser implements Vehicle
{
	@Override
	public void getSpec() 
	{
		System.out.println("HmvUser --- getSpec()");
	}
	public static void main(String[] args) 
	{
		HmvUser hmvUser = new HmvUser();
		
		hmvUser.testDefault();
		
		System.out.println(hmvUser.SPEED);

		Vehicle.testStatic();
	}
}
