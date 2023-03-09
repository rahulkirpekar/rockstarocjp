package stringtopic;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	
	public Student() 
	{
	}
	public Student(int rno, String name, int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	} 
	public void disp() 
	{
		System.out.println(rno + " "+name + " "+std);
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		Student s2 = (Student)obj;
		return (name.equals(s2.name));
	}
}
