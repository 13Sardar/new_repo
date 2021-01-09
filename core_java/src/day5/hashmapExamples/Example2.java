package day5.hashmapExamples;
import java.util.*;
public class Example2 {
	

	

		public static void main(String[] args) {
			//Instead of HashMap we can write Map on the left hand side of the HashMap line, Because we can store values in interface(Map).
			//This is also similar for LinkedList (List) left-side and ArrayList (List)left-Side
			Map<String, String> mapOfStatesAndCities = new HashMap<String, String>();
			
			mapOfStatesAndCities.put("Pune","Maharashtra");
			mapOfStatesAndCities.put("Kota","Raj");
			mapOfStatesAndCities.put("Jaipur","Maharashtra");
			
			
			Set<String> keySet= mapOfStatesAndCities.keySet();
			for(String x:keySet) {
				String value = mapOfStatesAndCities.get(x);
				System.out.println(x +"\t"+value);
				
			}
		
	//	System.out.println(mapOfStatesAndCities);
		
		}
		
}
