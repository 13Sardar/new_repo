package day3.Gagan.polyy;

import java.util.Scanner;

public class Square extends Poly {
	public void area() {
//		int i=50;
		@SuppressWarnings("resource")
		Scanner area = new Scanner(System.in);
		int i = area.nextInt();
		
		
		int x=i*i;
		System.out.println("Area of Sq is : "+ x);
	}

}
