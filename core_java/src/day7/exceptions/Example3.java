package day7.exceptions;

public class Example3 {
	
	// demo of throw keyword

	public static void checkAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}

	public static void main(String[] args) {
		//Try not to use throws exception in main class.
		try {
			checkAge(18);
		} catch (Exception e) {

			System.out.println("Something went wrong:" + e.getMessage());
		}
	}
}