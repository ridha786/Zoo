package edu.uga.cs1302.zoo;

public abstract class Animal implements Nameable{
	protected String name;
	protected int numLegs;
	protected int age;
	protected static int instances = 0;
	
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name= name;
	}
	
	public int getLegs(){
		return numLegs;
	}
	
	public void setLegs(int numLegs){
		this.numLegs = numLegs;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public Animal(String name, int numLegs, int age){
		this.name = name;
		this.numLegs = numLegs;
		this.age = age;
		instances++;
	}
}
