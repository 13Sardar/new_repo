// demo of parameterized constructor of ArrayList
// new ArrayList(Collection c)


package day6.doubt;

import java.util.*;

public class ConstructorOfArrrayList {
	
	public static void main(String[] args) {
		Set<String> cars = new HashSet<String>();
		cars.add("Honda");
		cars.add("Hyundai");
		cars.add("Renault");
		cars.add("Kia");
		
		List<String> listOfCars = new ArrayList<String>(cars);
		displayList(listOfCars);
		}
	
		public static void displayList(List<String>list1) {
		for(String x:list1) {
		System.out.println(x);
		}
	}

}
