package day6.examples;
import java.util.*;

import day6.beans.Student;

public class Example7Student {
	public static void main(String[] args) {
		
		Student student1 = new Student(12,"NAme1","Bio");
		Student student2 = new Student(31,"NAme2","Math");
		Student student3 = new Student(87,"NAme3","Arts");
		
		HashMap<Integer, Student> dStudent = new HashMap<Integer, Student>();
		dStudent.put(22, student1);
		dStudent.put(33, student2);
		dStudent.put(44, student3)
;		
		Set<Integer> keySet = dStudent.keySet();
		
		System.out.println("-------------------------Iterator------------------------");
		Iterator<Integer> iter = keySet.iterator();
		while(iter.hasNext()) {
			int x = iter.next();
			Student y = dStudent.get(x);
			System.out.println(x+"    "+y); 
		}
		
		System.out.println("-------------------------For-Each------------------------");
		
		for(int a : keySet ) {
			Student s = dStudent.get(a);
			System.out.println(a+"\t"+s);
		}
		
	}

}
