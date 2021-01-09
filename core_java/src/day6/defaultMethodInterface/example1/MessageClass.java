package day6.defaultMethodInterface.example1;

public interface MessageClass {
	
	default void display() {
		System.out.println("I can do Addition");
	}

}
