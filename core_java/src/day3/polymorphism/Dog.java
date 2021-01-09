package day3.polymorphism;
//Here if we comment out public void animalSound we will get the output of Animal class from Animal.java
//because its supper/parent class.
//this is called as method overriding.
public class Dog extends Animal{
	public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }

}
