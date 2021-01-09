package day3.Gagan.inheritance;
import java.util.*;
public class Bicycle {

	public void start() {
		
		Scanner gear = new Scanner(System.in);
		Scanner speed = new Scanner(System.in);
		
		System.out.println("Enter Gear : ");
		int gr = gear.nextInt();
		System.out.println("Enter Speed : ");
		
		int sp = speed.nextInt();

		if(gr<3) {
			System.out.println("Gear should be increased");
		}else {
			System.out.println("Gear should be decreased");
		}
		
		if(sp>40) {
			System.out.println("Apply Breaks");
		}else {
			System.out.println("Your Speed if Normal");
		}
	}
	
	

}
