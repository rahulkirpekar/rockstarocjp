package collectiontopic.sorttech.comparabletopic;

public class Student implements Comparable<Student>
{
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	public Student() 
	{
	}
	public Student(int rno, String name, int std, int marks) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void disp() 
	{
		System.out.println(rno + " "+ name + " " +std + " "+marks);
	}
//	@Override
//	public int compareTo(Student s2) 
//	{
//		// s1 > s2
//		if (getMarks() > s2.getMarks()) 
//		{
//			return 1;
//		} else if(getMarks() < s2.getMarks())
//		{
//			return -1;
//		}else 
//		{
//			// same both objects marks then return 0;
//			return 0;
//		}
//	}
	
	@Override
	public int compareTo(Student s2) 
	{
		return (getName().compareTo(s2.getName()));
	}
}
