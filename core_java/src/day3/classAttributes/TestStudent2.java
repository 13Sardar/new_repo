package day3.classAttributes;
import day3.beans.*;
public class TestStudent2 {
	public static void main(String[] args) {
		Student student1 = new Student(1,"Lisaa","BE");
//		System.out.println(student1);
		
		Student student2 = new Student(2,"Lily","BE");
//		System.out.println(student2);
		
		Student student3 = new Student(3,"Lola","BE");
//		System.out.println(student3);
		
		Student student4 = new Student(4,"Lisha","BE");
//		System.out.println(student4);
		Student[] arrayOfStudents = {student1,student2,student3,student4	};

		
//Create object of TestStudent2, and supplying the values.
		TestStudent2 testStudent2 = new TestStudent2();
		testStudent2.displayAllStudents(arrayOfStudents);
	}		
	
//To Access the values we need values passed from main class we need object. So creating Object in main class "TestStudent2".
	public void displayAllStudents(Student[] arrayOfStudents) {
		for(Student student:arrayOfStudents) {
			System.out.println(student);
		}
		
		
	}
	
}
