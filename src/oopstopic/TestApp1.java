package oopstopic;

public class TestApp1 
{
		public static void main(String[] args) 
		{
//			Student s[5];
			Student s[] = new Student[5];
			
			for(int i=0 ; i < s.length ; i++) 
			{
				s[i] = new Student();
				s[i].scan();
			}
			for(int i=0 ; i < s.length ; i++) 
			{
				s[i].disp();
			}
			
		}
}
