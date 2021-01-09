package day8.JDBC_Practice;

import java.sql.*;
import beans.Student;
import utility.DButil;

public class Example7 {
	public static void main(String[] args) {
	
		Student student1 = new Student(6,"Vijay","Arts",2,19);
		Example7 example7 = new Example7();
		example7.addStudent(student1);

	}
	
	public void addStudent(Student student) {
		System.out.println("Now inserting Student in dataBase :" + student);
		Connection con = DButil.getMySqlDbConnection();
		String sql = "insert into student values (?,?,?,?,?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setInt(1, student.getRollNumber());
			pst.setString(2, student.getStudentName());
			pst.setString(3, student.getCourseName());
			pst.setInt(4, student.getDurationOfCourse());
			pst.setInt(5, student.getAgeOfStd());
			
			int result = pst.executeUpdate();
			if(result == 0) {
				System.out.println("Could not enter");
			}
			else {
				System.out.println("Student Details Entry DoneS");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}