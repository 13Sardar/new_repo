package day5.arrayLists;

import java.util.ArrayList;

public class ExampleInt {
	public static void main(String[] args) {
		
ArrayList<Integer> stdId= new ArrayList<Integer>();
		
		stdId.add(10);
		stdId.add(20);
		stdId.add(30);
		stdId.add(40);
		
		for(int i=0; i<stdId.size();i++) {
			int z = stdId.get(i);
			System.out.println(z);
		}
		
	}
}
