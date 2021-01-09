package day3.Gagan.Testing;

import java.util.ArrayList;

import day3.Gagan.beansPr.Banking;


public class TestBanking {

	public static void main(String[] args) {
	
		Banking banking1 = new Banking(1,"		AXIS \t","	Rahul");
		Banking banking2 = new Banking(2,"		ICICI \t","		Akash");
		Banking banking3 = new Banking(3,"		HDFC \t","	Karan");
		Banking banking4 = new Banking(4,"		CBI \t","	Jimmy");
		Banking banking5 = new Banking(5,"		HDBC \t","	Harsh");
		
		ArrayList<Banking> dispBanking = new ArrayList<Banking>();
		dispBanking.add(banking1);
		dispBanking.add(banking2);
		dispBanking.add(banking3);
		dispBanking.add(banking4);
		
		for(Banking banking:dispBanking) {
			System.out.println(banking);
		}
/*		Banking[] allDetails = {banking1,banking2,banking3,banking4,banking5};
		
		TestBanking testBanking = new TestBanking();
		testBanking.displayDetails(allDetails);
		
	
	}
	
	public void displayDetails(Banking[] allDetails) {
		
		*/	
	}
	
	
	
}
