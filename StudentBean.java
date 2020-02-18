package com.jkt.ServletDemo;

public class StudentBean implements java.io.Serializable 
{
	private String Firstname=null;
	private String Lastname=null;
	private int age=0;
	
	public StudentBean()
	{
		super();
	}
	
	public void setFirstname(String Firstname)
	{
		this.Firstname=Firstname;
	}
	public String getFirstname()
	{
		return Firstname;
	}
	
	public void setLastname(String Lastname)
	{
		this.Lastname=Lastname;
System.out.println("hey");
	}
	public String getLastname()
	{
		return Lastname;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}

}
