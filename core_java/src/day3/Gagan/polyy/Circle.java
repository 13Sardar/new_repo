package day3.Gagan.polyy;

import java.util.Scanner;

public class Circle extends Poly {
	protected void area () {
//		int r;
		@SuppressWarnings("resource")
		Scanner radius = new Scanner(System.in);
		int r = radius.nextInt();
		
		
		double x=3.14*r*r;
		System.out.println("Area of circle is : "+x);
	}

}
