package edu.uga.cs1302.zoo;
import java.util.Scanner;
public class ZooDriver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);



		Animal [] zoo = new Animal [18];
		Dog alex1 = new Dog("Alex1", 4, 5);
		Dog alex2 = new Dog("Alex2", 4, 6);
		Dog alex3 = new Dog("Alex3", 4, 7);
		Cat emma1 = new Cat("Emma1", 4, 5);
		Cat emma2 = new Cat("Emma2", 4, 6);
		Cat emma3 = new Cat("Emma3", 4, 7);
		Dragon eragon1 = new Dragon("Eragon1", 4, 20);
		Dragon eragon2 = new Dragon("Eragon2", 4, 25);
		Dragon eragon3 = new Dragon("Eragon3", 4, 30);
		Hippogriff buckbeak1 = new Hippogriff("Buckbeak1", 4, 15);
		Hippogriff buckbeak2 = new Hippogriff("Buckbeak2", 4, 17);
		Hippogriff buckbeak3 = new Hippogriff("Buckbeak3", 4, 19);
		Elephant james1 = new Elephant("James1", 4, 30);
		Elephant james2 = new Elephant("James2", 4, 35);
		Elephant james3 = new Elephant("James3", 4, 40);
		Flycat jace1 = new Flycat("Jace1", 4 , 2);
		Flycat jace2 = new Flycat("Jace2", 4 , 4);
		Flycat jace3 = new Flycat("Jace3", 4 , 6);

		zoo[0] = alex1;
		zoo[1] = alex2;
		zoo[2] = alex3;
		zoo[3] = emma1;
		zoo[4] = emma2;
		zoo[5] = emma3;
		zoo[6] = eragon1;
		zoo[7] = eragon2;
		zoo[8] = eragon3;
		zoo[9] = buckbeak1;
		zoo[10] = buckbeak2;
		zoo[11] = buckbeak3;
		zoo[12] = james1;
		zoo[13] = james2;
		zoo[14] = james3;
		zoo[15] = jace1;
		zoo[16] = jace2;
		zoo[17] = jace3;


		String command = "";
		do{
			System.out.println("Press 1 to see how many animals are in the system. \nPress 2 to see the name and kind of each animal. \n"
					+ "Press 3 to see which animals can fly. \nPress 4 to see which animals can run. \nPress 5 to see which animals can run AND fly."
					+ "\nPress 6 to see a description of each animal. \nPress q to terminate the program. " );
			command = keyboard.nextLine();
			if (command.equals("1")){
				System.out.println(Animal.instances);
				System.out.println("");
			}
			else if (command.equals("2")){
				for(int i =0; i<zoo.length; i++){
					if(zoo[i] instanceof Dog){
						System.out.println("My name is " + zoo[i].getName() +" and I am a dog" );
					}
					if(zoo[i] instanceof Cat){
						System.out.println("My name is " + zoo[i].getName() +" and I am a cat" );
					}
					if(zoo[i] instanceof Dragon){
						System.out.println("My name is " + zoo[i].getName() +" and I am a dragon" );
					}
					if(zoo[i] instanceof Hippogriff){
						System.out.println("My name is " + zoo[i].getName() +" and I am a hippogriff" );
					}
					if(zoo[i] instanceof Elephant){
						System.out.println("My name is " + zoo[i].getName() +" and I am an elephant" );
					}
					if(zoo[i] instanceof Flycat){
						System.out.println("My name is " + zoo[i].getName() +" and I am a flycat" );
					}

				}
				System.out.println("");
			}
			else if (command.equals("3")){
				for(int i =0; i<zoo.length; i++)	{			
					if(zoo[i] instanceof Flycat){
						System.out.println(zoo[i].getName() + " is a flycat that can fly");
					}
				}
				System.out.println("");
			}

			else if (command.equals("4")){
				for(int i =0; i<zoo.length; i++)	{			
					if(zoo[i] instanceof Dog){
						System.out.println(zoo[i].getName() + " is a dog that can run");
					}
					if(zoo[i] instanceof Cat){
						System.out.println(zoo[i].getName() + " is a cat that can run");
					}
					if(zoo[i] instanceof Elephant){
						System.out.println(zoo[i].getName() + " is an elephant that can run");
					}
				}
				System.out.println("");
			}
			else if (command.equals("5")){
				for(int i =0; i<zoo.length; i++)	{			
					if(zoo[i] instanceof Dragon){
						System.out.println(zoo[i].getName() + " is a dragon that can run and fly");
					}
					if(zoo[i] instanceof Hippogriff){
						System.out.println(zoo[i].getName() + " is a hippogriff that can run and fly");
					}
				}
				System.out.println("");
			}
			else if (command.equals("6")){
				for(int i =0; i<zoo.length; i++)	{			
					if(zoo[i] instanceof Dog){
						System.out.println("I am a " + zoo[i].getAge() + " year old dog and my name is " + zoo[i].getName() + ". I have " + zoo[i].getLegs() +
								 " legs and I can run");
					}
					if(zoo[i] instanceof Cat){
						System.out.println("I am a " + zoo[i].getAge() + " year old cat and my name is " + zoo[i].getName() + ". I have " + zoo[i].getLegs() +
								 " legs and I can run");
					}
					if(zoo[i] instanceof Dragon){
						System.out.println("I am a " + zoo[i].getAge() + " year old dragon and my name is " + zoo[i].getName() + ". I have " + zoo[i].getLegs() +
								 " legs and I can run and fly");
					}
					if(zoo[i] instanceof Hippogriff){
						System.out.println("I am a " + zoo[i].getAge() + " year old hippogriff and my name is " + zoo[i].getName() + ". I have " + 
					zoo[i].getLegs() + " legs and I can run and fly");
					}
					if(zoo[i] instanceof Elephant){
						System.out.println("I am a " + zoo[i].getAge() + " year old elephant and my name is " + zoo[i].getName() + ". I have " + zoo[i].getLegs() +
								 " legs and I can run");
					}
					if(zoo[i] instanceof Flycat){
						System.out.println("I am a " + zoo[i].getAge() + " year old flycat and my name is " + zoo[i].getName() + ". I have " + zoo[i].getLegs() +
								 " legs and I can fly");
					}
					
				}
				System.out.println("");

			}
			else if (command.equals("q")){

				System.exit(0);
			}
			else{
				System.out.println("Error. Enter 1,2,3,4,5,6 or q");
			}

		}while(!command.equals("q"));
	}
}
