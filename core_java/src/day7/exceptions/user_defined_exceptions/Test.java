package day7.exceptions.user_defined_exceptions;

public class Test {
	
	
	public static void checkAge(int age) throws AgeNotValidException {
		if(age<18) {
		throw new AgeNotValidException("Access denied - You must be at least 18 years old.");
		}
		else {
		System.out.println("Access granted - You are old enough!");
		}
		}
		public static void main(String[] args) {
		try {
			checkAge(19);
		} catch (AgeNotValidException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		}
	

}
