package day6.examples;
import java.util.*;

import day6.beans.Cricketer;
public class Example4Cricketer {
	public static void main(String[] args) {
		
		Cricketer dCricketer1 = new Cricketer(10,"Sachin");
		Cricketer dCricketer2 = new Cricketer(20,"Dhoni");
		Cricketer dCricketer3 = new Cricketer(30,"Virat");
		
		
		
		HashSet<Cricketer> dCricketer = new HashSet<Cricketer>();
		dCricketer.add(dCricketer1);
		dCricketer.add(dCricketer2);
		dCricketer.add(dCricketer3);
		
		
		System.out.println("-------------------------For-Each------------------------");
		for(Cricketer z : dCricketer) {
			System.out.println(z);
		}
		
		System.out.println("-------------------------Iterator------------------------");
		Iterator<Cricketer> iter = dCricketer.iterator();
		while(iter.hasNext()) {
			Cricketer p = iter.next();
			System.out.println(p);

		}
		
		
		
		
		
	}

}
