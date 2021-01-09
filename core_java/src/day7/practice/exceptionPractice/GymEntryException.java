package day7.practice.exceptionPractice;

public class GymEntryException extends Exception{
	
	public GymEntryException() {
		System.out.println("Wrong Day for Gym");
	}
	
	public GymEntryException(String message) {
		System.out.println(message);
	}

}
