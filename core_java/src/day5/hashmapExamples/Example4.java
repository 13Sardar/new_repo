package day5.hashmapExamples;

import java.util.*;

public class Example4 {
	public static void main(String[] args) {
		
		Map<Integer, Double> amount = new HashMap<Integer, Double>();
		
		amount.put(10,30000.56);
		amount.put(11,43300.126);
		amount.put(12,30500.8900);
		
		//Displaying only the values
		
		Set<Integer> keySet= amount.keySet();
		for(int i:keySet) {
			Double value = amount.get(i);
			System.out.println(i +"\t"+value);
			
		}
		
	//	System.out.println(amount);
	}

}
