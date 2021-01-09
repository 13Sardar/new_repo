package day5.hashmapExamples;

import java.util.*;

import day3.classAttributes.Employee;

public class Example5 {

	public static void main(String[] args) {
		//Passing Integer for Key and String for Value
		//Memory Allocation is Random for HashMap
		//It can Display in Any Order after changing the keys, No fixed order is there.
		HashMap<Integer, String> mapOfCities = new HashMap<Integer, String>();
		mapOfCities.put(0210, "Pune");
		mapOfCities.put(32, "Mumbai");
		mapOfCities.put(32, "Kota");
		mapOfCities.put(400, "Jaipur");
	
		//HashMap Displaying Using Iterator.
		Set<Integer> keysSet = mapOfCities.keySet();
		
		Iterator<Integer> iter = keysSet.iterator();
		while(iter.hasNext()) {
		int key = iter.next();
		
		String x = mapOfCities.get(key);
		System.out.println(x);
		}

	
	}
	
}
