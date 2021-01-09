package day5.arrayLists;

import java.util.*;

import day3.classAttributes.Employee;
import day5.arrayLists.beanss.Course;


public class ExampleBeans {
	public static void main(String[] args) {
		
		Course course1 = new Course("Math");
		Course course2 = new Course("Bio");
		Course course3 = new Course("Commerce");
		Course course4 = new Course("Arts");
		
		ArrayList<Course> dispCourse = new ArrayList<Course>();
		dispCourse.add(course1);
		dispCourse.add(course2);
		dispCourse.add(course3);
		dispCourse.add(course4);
		
		
		Iterator<Course> iter= dispCourse.iterator();
		while(iter.hasNext()) {
			Course displayC = iter.next();
			System.out.println(displayC);
			}
		
	}

}
