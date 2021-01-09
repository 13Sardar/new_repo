package day4.javaDates;

import java.time.*;

public class Example1 {
	public static void main(String[] args) {
		
		//To Display Local Date
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		//To Display Local Time
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		//To Display Date and Time Together
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
				
	}

}
