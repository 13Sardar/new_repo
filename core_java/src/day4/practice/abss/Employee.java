package day4.practice.abss;

import java.util.ArrayList;

public class Employee extends Salary{
	public void empDetails(){
		
		ArrayList<String> employee = new ArrayList<String>();
		employee.add("emp1");
		employee.add("emp2");
		employee.add("emp3");
		employee.add("emp4");
		for(String s:employee)
		System.out.println(s);
	}
}
