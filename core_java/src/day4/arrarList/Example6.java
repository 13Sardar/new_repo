/*
* adding of values in arraylist using scanner and loops
* run a for loop to add four cities in arraylist of string and then display all of them
* names of cities should be received by user-input using Scanner
*/



package day4.arrarList;
import java.util.*;
public class Example6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of elements to be added :");
		int x = sc.nextInt();
		
		ArrayList<String> name = new ArrayList<String>();
		for(int i=1;i<x+1;i++) {
		Scanner citiesName = new Scanner(System.in);
		System.out.println("Enter City Name : "+i);
		String cities = citiesName.nextLine();
		
		name.add(cities);
		
		}
		System.out.println(name);
		
	}

}
