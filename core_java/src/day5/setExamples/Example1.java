package day5.setExamples;

import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		Set<Integer> setOfIds = new HashSet<Integer>();
		setOfIds.add(34213);
		setOfIds.add(21342);
		setOfIds.add(54365);
		setOfIds.add(87123);
		
		
		//Using For-Each loop to Display
		// System.out.println(setOfIds);
		for(int x:setOfIds) {
		System.out.println(x);
		}
	}

	
	
	
	
}
