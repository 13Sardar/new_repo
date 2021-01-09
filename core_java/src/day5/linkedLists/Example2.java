package day5.linkedLists;
import java.util.*;
public class Example2 {
	public static void main(String[] args) {
		
		LinkedList<Integer> salariesList = new LinkedList<Integer>();
		
		salariesList.add(25000);
		salariesList.add(30000);
		salariesList.add(20000);
		salariesList.add(24000);
		//To Sort the List in ascending Order
		Collections.sort(salariesList);
		
		for(int i : salariesList) {
			System.out.println(i);
		}
		System.out.println("**********************************");
		//To sort the List in descending order
		Collections.sort(salariesList, Collections.reverseOrder());
		for(int i : salariesList) {
			System.out.println(i);
		}
		
		
	}

}
