package day4.arrarList;

import java.util.*;

public class Example4 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("BMW");
		
		//Using Iterator for printing
		Iterator<String> iter = cars.iterator();
		while(iter.hasNext()) {
		String car = iter.next();
		System.out.println(car);
		}
		
	}

}
