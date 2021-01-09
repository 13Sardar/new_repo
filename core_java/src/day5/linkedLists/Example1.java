package day5.linkedLists;
import java.util.LinkedList;
public class Example1 {
	public static void main(String[] args) {
		
		LinkedList<String> cars =new LinkedList<String>();
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("BMW");
		
		
		//complete LinkedList will be printed
		System.out.println(cars);
		
		//Particular index will be printed
		System.out.println(cars.get(0));
		System.out.println(cars.get(3));
		
		//Index value exceeded
	//	System.out.println(cars.get(4));
	
		//Updating Values in LinkedList
		System.out.println("Updating Volvo to opel : ");
		cars.set(0,"Opel");
		System.out.println(cars);
		
		//Removing index 2
		System.out.println("Removing Honda from LinkedList");
		cars.remove(2);
		System.out.println(cars);
		
		//Removing all the Elements
/*		System.out.println("Removing All Elements : ");
		cars.clear();
		System.out.println(cars);
*/
		
		//Size of Array 
		cars.size();
		System.out.println("Size of the List is "+ cars);
		
		
	}

}
