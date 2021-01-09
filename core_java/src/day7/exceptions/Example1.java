//Try-Catch-Finally

package day7.exceptions;
//here array will not have anything at index 10, as it is not created so it gives an error ArrayIndexOutOfBoundsException.
//but  we use try catch method to catch method, and display Message for exception

public class Example1 {
	public static void main(String[] args) {
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    }finally {
		    	//Finally block will definitely get executed, even if try works or catch works.
		    	System.out.println("This is Finally Block");
		    }
	}

}
