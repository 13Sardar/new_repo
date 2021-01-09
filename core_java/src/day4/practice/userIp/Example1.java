package day4.practice.userIp;

import java.util.Scanner;

public class Example1 {
	
	public static void main(String[] args) {
		
		Scanner gear = new Scanner(System.in);
		Scanner speed = new Scanner(System.in);
		
		System.out.println("Enter Gear : ");
		int gr = gear.nextInt();
		System.out.println("Enter Speed : ");
		int sp = speed.nextInt();

		if(gr<3) {
			System.out.println("Your Gear is "+gr+". You can increase your Gear");
		}else {
			System.out.println("Your Gear is "+gr+". You should be decreasing your Gear");
		}
		
		if(sp>40) {
			System.out.println("Your Speed : "+sp+"km/h. TOO FAST!!! \nApply Breaks.");
		}else {
			System.out.println("Your Speed is "+sp+"km/h, Normal");
		}
	}

}
