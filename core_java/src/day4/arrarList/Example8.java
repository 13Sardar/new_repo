package day4.arrarList;

import java.util.ArrayList;
import java.util.Collections;

public class Example8 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("BMW");
		
				//To Sort the List in ascending Order
				Collections.sort(cars);
				for(String i : cars) {
					System.out.println(i);
				}
				
				System.out.println("******************************************************");
				
				//To sort the List in Descending order.
				Collections.sort(cars, Collections.reverseOrder());
				for(String i : cars) {
					System.out.println(i);
				}
		
		
		
	
		
	}

}
