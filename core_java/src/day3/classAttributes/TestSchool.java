package day3.classAttributes;
import day3.beans.*;
public class TestSchool {
	public static void main(String[] args) {
		School school1 = new School(10,"\t Karn","\t A \t",9874);
		School school2 = new School(20,"\t Akash", "\t B \t",7412);
		School school3 = new School(30,"\t Gagan", "\t C \t",9872);
		
		School[] allDetails = {school1,school2,school3};
		
		TestSchool testSchool=new TestSchool();
		testSchool.displayDetails(allDetails);
		
	}
	
	public void displayDetails(School[] allDetails) {
		for(School school: allDetails) {
			System.out.println(school);
		}
	}
	

}
