package day5.setExamples;

import java.util.*;

public class Example4 {
	public static void main(String[] args) {
		
		Set<String> countries = new HashSet<String>();
		countries.add("India1");
		countries.add("Pakistan1");
		countries.add("NEpal1");

		//Using Iterator loop to Display
		Iterator<String> iter = countries.iterator();
		
		while(iter.hasNext()) {
			String x = iter.next();
			System.out.println(x);
		}
	}
}
