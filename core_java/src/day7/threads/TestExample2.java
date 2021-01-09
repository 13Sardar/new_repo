package day7.threads;

public class TestExample2 {
	
	public static void main(String[] args) {
		Example2 example2 = new Example2();
		Thread thread1 = new Thread(example2);
		thread1.start();
	}

}
//we didn't even call the run method, still it is working. Required to create thread object