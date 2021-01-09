package day2.gaganExamples;

public class Example1 {
	public static void main(String[] args) {
		int a[] = {10,20,30};
		String b[] = {"A","B","C"};
		
		
		System.out.println(a[0]+"	"+b[0]);
		
		System.out.println("++++++++++++++++++");
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"	"+b[i]);
			
		}
		a[1]= 100;
		System.out.println("++++++++++++++++++");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"	"+b[i]);
			
		}
	}

}
