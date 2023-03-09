package oopstopic.abstopic;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Vechile Choice : ");
		System.out.println("1) For TwUser");
		System.out.println("2) For LmvUser");
		System.out.println("3) For HmvUser");
		int choice = sc.nextInt();
		Vehicle vehicle = null;
		switch(choice) 
		{
			case 1: vehicle = new ElecTwUser();
					vehicle.getSpec();
					break;
			case 2: vehicle = new LmvUser();
					vehicle.getSpec();
					break;
			case 3: vehicle = new HmvUser();
					vehicle.getSpec();
					break;
		}
	}
}
