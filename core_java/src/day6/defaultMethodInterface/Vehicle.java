package day6.defaultMethodInterface;

public interface Vehicle {
	
	default void print() {
		System.out.println("I'm a Vehicle");
	}
	
	
}
