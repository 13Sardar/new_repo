package day6.defaultMethodInterface;

public interface FourWheeler {
	default void print() {
		System.out.println("I'm a Fourwheeler ");
	}
	
}
