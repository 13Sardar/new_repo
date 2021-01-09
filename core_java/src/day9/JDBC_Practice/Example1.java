package day9.JDBC_Practice;

import beans.Student;

public class Example1 {
	public static void main(String[] args) {
		
		Student student1 = new Student(8,"sanjay","Diploma",3,18);
		StudentDao example1 = new StudentDao();

		//example1.deleteStudent(8);
		Student student = new Student(6,"Karan","BE",6,25);
		 example1.updateStudent(student);
		/*
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Roll number you want to search : ");
		int rollNo = sc1.nextInt();
		System.out.println("Student Searching Witth Roll Number.");
//		example1.getStudent(rollNo);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Roll number you want to search : ");
		String Name = sc2.nextLine();
		System.out.println("Student Searching Witth Name.");
//		example1.getStudent(Name);
		
//    	example1.addstudent(student1);
//		example1.getAllStudent();		
		*/
	}
	
	
	
}
