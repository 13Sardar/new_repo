package day7.practice.exceptionPractice;

public class Throw_practice2 {
	public static void checkValue(int value)  throws Exception  {
		if(value==156) {
			throw new Exception("Correct Value");
		}else {
			System.out.println("Wrong Value");
		}
	}
	public static void main(String[] args) {
		try {
		checkValue(156);
		}catch (Exception e){
			System.out.println("Wrong Value Selected");
			
		}
	}

}
