package day6.defaultMethodInterface.example1;

public class DisplayClass implements MessageClass, CalculatorClass {
	
	public void display() {
		MessageClass.super.display();
		CalculatorClass.super.display();
	}
	

}
