package day7.practice.exceptionPractice;

public class Try_catch_finallly {
	
	public static void main(String[] args) {
		
		try {
			int[] x = {1,2,3,4,5};
			System.out.println(x[1]==2);
			
		}catch (Exception e){
			 System.out.println("Wrong Value.");
	    }finally {
	    	System.out.println("Finally Block");
			
		}
	}

}
