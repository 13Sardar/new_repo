//Aishwarya93032

package day5.linkedLists.LinkedListOfBeans;

import java.util.*;

import day3.classAttributes.Employee;

public class Example1 {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1001,"\tName1");
		Employee employee2 = new Employee(1002,"\tName2");
		Employee employee3 = new Employee(1003,"\tName3");
		Employee employee4 = new Employee(1004,"\tName4");
		
		LinkedList<Employee> employeeList = new LinkedList<Employee>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		
		for(Employee employee:employeeList) {
			System.out.println(employee);
			}
		
		
	}

}
