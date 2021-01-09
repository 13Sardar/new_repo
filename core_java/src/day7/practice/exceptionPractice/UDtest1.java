package day7.practice.exceptionPractice;

public class UDtest1 {
	
	public static void checkValue(int integervalue) throws UDpractice1WrongValueException {
		if(integervalue<100) {
			throw new UDpractice1WrongValueException("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}
	public static void main(String[] args) {
		try {
			checkValue(110);
		} catch (UDpractice1WrongValueException e) {
			System.out.println(e);
		}
		
	}

}
