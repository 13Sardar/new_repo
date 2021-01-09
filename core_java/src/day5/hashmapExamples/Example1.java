package day5.hashmapExamples;

import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		//Passing Integer for Key and String for Value
		//Memory Allocation is Random for HashMap
		//It can Display in Any Order after changing the keys, No fixed order is there.
		HashMap<Integer, String> mapOfCities = new HashMap<Integer, String>();
		mapOfCities.put(0210, "Pune");
		mapOfCities.put(32, "Mumbai");
		mapOfCities.put(32, "Kota");
		mapOfCities.put(400, "Jaipur");
	
		Set<Integer> keySet= mapOfCities.keySet();
		for(Integer x:keySet) {
			String value = mapOfCities.get(x);
			System.out.println(x +"\t"+value);
			
		}
		
		
		
		//System.out.println(mapOfCities);
	
	}
	
}
