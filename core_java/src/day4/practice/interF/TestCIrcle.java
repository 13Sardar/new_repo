package day4.practice.interF;

import java.util.Scanner;

public class TestCIrcle {
	
    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        
          double radius = sc1.nextDouble();
        
        Circle circle = new circleCalculation();
        circle.areaOfCircle(radius);
        circle.circumference(radius);
    }

}
