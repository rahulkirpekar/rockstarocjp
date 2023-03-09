package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Scanner;
public class SmApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice = 0 ;
		ArrayList<Student> list = new ArrayList<Student>();
		Student s = null;
		while(choice != 6) 
		{
			System.out.println("Enter below choice :: ");
			System.out.println("1) Insert Student              ");
			System.out.println("2) Update Student By Id        ");
			System.out.println("3) Delete Student By Id        ");
			System.out.println("4) Display All Students records");
			System.out.println("5) Search Student By student id");
			System.out.println("6) For Exit");
			choice = sc.nextInt();
			
			switch (choice) 
			{
				case 1: s = new Student();
						s.scan();
						list.add(s);
						System.out.println("Student record successfully Inserted");
						break;
				case 2: System.out.println("Enter Rno  whcih you want to update Student record: ");
						int updateRno = sc.nextInt();
						boolean flag = false;
						int i = 0;
						for (; i < list.size(); i++) 
						{
							s = list.get(i);
							if(s.getRno()==updateRno) 
							{
								flag = true;
								break;// i--2
							}
						}
						if(flag) 
						{
							s.update();
							list.set(i, s);// update
							System.out.println("Student Record successfully updated.");
						}else 
						{
							System.out.println("Given rno not found in List.");
						}
						break;
				case 3:
						System.out.println("Enter student rno which you want to Delete : ");
						int deleteRno = sc.nextInt();
						boolean flagSearch = false; 
						for ( i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							if (s.getRno()==deleteRno) 
							{
								flagSearch = true;
								break;
							} 
						}
						if(flagSearch) 
						{
							list.remove(i);
							System.out.println("Student record deleted....!!!");
						}else 
						{
							System.out.println("Student record Not Found....!!!");
						}
						break;
				case 4: 
						for (i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							s.disp();
						}
						break;
				case 5: System.out.println("Enter student rno which you want to search : ");
						int searchRno = sc.nextInt();
						flagSearch = false; 
						for ( i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							if (s.getRno()==searchRno) 
							{
								flagSearch = true;
								break;
							} 
						}
						if(flagSearch) 
						{
							System.out.println("Student record Found....!!!");
							s.disp();
						}else 
						{
							System.out.println("Student record Not Found....!!!");
						}
						break;
				case 6:
						break;
				default:
						break;
			}
		}
	}
}