package day7.practice.threadsPr;

public class TestPrExample {

	public static void main(String[] args) {
	
		Example1 example1 = new Example1();
		Example2 example2 = new Example2();
		
		Thread thread1 = new Thread(example1);
		Thread thread2 = new Thread(example2);
		
		
		thread1.start();
		thread2.start();

	}

}
