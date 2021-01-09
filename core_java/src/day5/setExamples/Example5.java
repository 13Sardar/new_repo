package day5.setExamples;
//Using Beans Class with Set
import java.util.*;

import day3.classAttributes.Employee;

public class Example5 {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(101,"Gagan");
		Employee employee2 = new Employee(102,"Akash");
		Employee employee3 = new Employee(103,"Karan");
		Employee employee4 = new Employee(104,"HArsh");
		
		Set<Employee> empDetails = new HashSet<Employee>();
		empDetails.add(employee1);
		empDetails.add(employee2);
		empDetails.add(employee3);
		empDetails.add(employee4);

		//Using Iterator loop to Display
		Iterator<Employee> iter = empDetails.iterator();
		
		while(iter.hasNext()) {
			Employee x = iter.next();
			System.out.println(x);
		}
	}
}
