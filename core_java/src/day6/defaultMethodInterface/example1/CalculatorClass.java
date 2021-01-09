package day6.defaultMethodInterface.example1;

import java.util.Scanner;

public interface CalculatorClass {
	default void display() {
		
		Scanner sc1 =new Scanner(System.in);
		Scanner sc2 =new Scanner(System.in);
		System.out.println("Enter first Value :  ");
		
		int x = sc1.nextInt();
		System.out.println("Enter Second Value :  ");
		int y = sc2.nextInt();
		int z = (x+y);
		System.out.println("Addition  result is :  "+z);
		
	}

}
