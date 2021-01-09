package day5.hashmapExamples;
import java.util.*;
public class Example3 {
	public static void main(String[] args) {
		
		Map<String,String> stdDetails = new HashMap<String,String>();
		
		stdDetails.put("Gagan", "A");
		stdDetails.put("Akash", "B");
		stdDetails.put("Karn", "A");
		stdDetails.put("HArsh", "D");
		
		Set<String> keySet= stdDetails.keySet();
		for(String i:keySet) {
			String value = stdDetails.get(i);
			System.out.println(i +"\t"+value);
			
		}
		
		
		
//		System.out.println(stdDetails);
		
		
	}

}
