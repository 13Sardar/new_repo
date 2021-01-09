package day2.gaganExamples;
//Print all even num. Starting from 5 to 50.
public class Example5 {
	public static void main(String[] args) {
		for(int i=5;i<=50;i++) {
			if(i % 5==0 && i % 3==0)
			System.out.println(i);
		}
	}
	
}
