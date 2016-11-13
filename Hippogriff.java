package edu.uga.cs1302.zoo;

public class Hippogriff extends Animal implements Runner,Flyer {

	public Hippogriff(String name, int numLegs, int age) {
		super(name, numLegs, age);
		
	}

	
	public void fly() {
		System.out.println(name + " is flying");
		
	}

	
	public void run() {
		System.out.println(name + " is running");
		
	}


}
