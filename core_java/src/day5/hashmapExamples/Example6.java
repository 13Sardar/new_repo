package day5.hashmapExamples;
import java.util.*;
public class Example6 {
	

	

		public static void main(String[] args) {
			//Instead of HashMap we can write Map on the left hand side of the HashMap line, Because we can store values in interface(Map).
			//This is also similar for LinkedList (List) left-side and ArrayList (List)left-Side
			Map<String, String> mapOfStatesAndCities = new HashMap<String, String>();
			
			mapOfStatesAndCities.put("Pune","Maharashtra");
			mapOfStatesAndCities.put("Kota","Raj");
			mapOfStatesAndCities.put("Jaipur","Maharashtra");
			
			
			Set<String> keySet= mapOfStatesAndCities.keySet();
			Iterator<String> iter = keySet.iterator();
			while(iter.hasNext()) {
				String i = iter.next();
				String x = mapOfStatesAndCities.get(i);
				System.out.println(x);
			}
		
		}
		
}
