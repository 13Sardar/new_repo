package day5.hashmapExamples;

import java.util.*;

import day3.classAttributes.Employee;

public class Example7 {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(11,"Gagan");
		Employee employee2 = new Employee(12,"Akash");
		Employee employee3 = new Employee(13,"Karan");
		Employee employee4 = new Employee(14,"HArsh");
		
		Map<Integer, Employee> employeeDetail = new HashMap<Integer, Employee>();
		employeeDetail.put(50, employee1);
		employeeDetail.put(123, employee2);
		employeeDetail.put(9, employee3);
		employeeDetail.put(73, employee4);
		
		Set<Integer> settingAkey = employeeDetail.keySet();
		for(int x : settingAkey) {
			Employee a = employeeDetail.get(x);
			System.out.println(x+"\t\t"+a);
			
		}
	}

}
