package edu.uga.cs1302.zoo;

public class Cat extends Animal implements Flyer {

	public Cat(String name, int numLegs, int age) {
		super(name, numLegs, age);	
	}

	
	public void fly() {
		System.out.println(name + " is flying");
	}

}
