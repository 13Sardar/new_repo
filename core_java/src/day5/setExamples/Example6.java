package day5.setExamples;
//Using Beans Class with Set
import java.util.*;

import day3.classAttributes.Employee;

public class Example6 {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(11,"Gagan");
		Employee employee2 = new Employee(12,"Akash");
		Employee employee3 = new Employee(13,"Karan");
		Employee employee4 = new Employee(14,"HArsh");
		
		Set<Employee> empDetails = new HashSet<Employee>();
		empDetails.add(employee1);
		empDetails.add(employee2);
		empDetails.add(employee3);
		empDetails.add(employee4);

		//Using Iterator loop to Display
		for(Employee x:empDetails) {
			System.out.println(x);
		}
	}
}
