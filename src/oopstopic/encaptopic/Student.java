package oopstopic.encaptopic;

// Strong Encapsulation applay in Student class
public class Student 
{
	private int rno;
	private String name;
	private int std;
	// setters --- Mutators
	public void setRno(int rno) 
	{
		this.rno=rno;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public void setStd(int std) 
	{
		this.std=std;
	}
	// getters---Accessors
	public int getRno()
	{
		return rno;
	}
	public String getName()
	{
		return name;
	}
	public int getStd() 
	{
		return std;
	}
}
