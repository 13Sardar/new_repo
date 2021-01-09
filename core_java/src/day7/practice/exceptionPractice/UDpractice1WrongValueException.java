package day7.practice.exceptionPractice;

public class UDpractice1WrongValueException extends Exception{
	
	public UDpractice1WrongValueException() {
		System.out.println("Yout Entry is wrong, Please enter correct Value.");
	}
	
	public UDpractice1WrongValueException(String message) {
		System.out.println(message);
	}
	
	
}
