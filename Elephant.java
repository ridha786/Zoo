package edu.uga.cs1302.zoo;

public class Elephant extends Animal implements Runner{

	public Elephant(String name, int numLegs, int age) {
		super(name, numLegs, age);
		
	}

	
	public void run() {
		System.out.println(name + " is running");
		
	}

}
