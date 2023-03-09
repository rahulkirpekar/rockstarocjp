package backupconst;

// Pure Encapsulation---Increase Security
public class Student 
{
	private int rno;// 0 
	private String name;//NULL
	private int std;//0
	// 1) Default Constructor
	public Student() 
	{
		System.out.println("START :: Default Constructor");
		rno=1;
		name="rahul";
		std=12;
		System.out.println("EXIT :: Default Constructor");
	}
	// 2) Para 
	public Student(int rno,String name,int std) 
	{
		System.out.println("START :: PARA Constructor");
		this.rno=rno;
		this.name=name;
		this.std=std;
		System.out.println("EXIT :: PARA Constructor");
	}
	// 3) COPY
	public Student(Student s) 
	{
		System.out.println("START :: COPY Constructor");
		this.rno=s.rno;
		this.name=s.name;
		this.std=s.std;
		System.out.println("EXIT :: COPY Constructor");
	}
	public void disp() 
	{
		System.out.println(rno + " " + name + " "+ std);
	}
	public static void main(String[] args) 
	{
		System.out.println("START :: MAIN Method");
		Student s1 = new Student();// JVM Default Constructor --- Default Values--[]
		Student s2 = new Student(2,"Krunal",10);// JVM Default Constructor --- Default Values--[]
		s1.disp();
		s2.disp();
		Student s3 = new Student(s2);
		s3.disp();
		System.out.println("EXIT :: MAIN Method");
	}
}