package day4.arrarList;

import java.util.ArrayList;

public class Example3 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("BMW");
		
		for( String car :cars) {
	           
            System.out.println(car);
        }
		/*for(int i=0; i<cars.size();i++) {
			String car = cars.get(i);
			System.out.println(car);
		}
		*/
		
		
	}

}
