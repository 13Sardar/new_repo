package day7.practice.exceptionPractice;

public class Throw_practice {
	
	public static void checkValue(int value) {
		if(value==156) {
			throw new ArithmeticException("Wrong Value");
		}else {
			System.out.println("Correct Value");
		}
	}
	public static void main(String[] args) {
		checkValue(156);
		
	}

}
