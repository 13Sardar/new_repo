package day9.JDBC_Practice;

import java.sql.*;

import beans.Product;
import beans.Student;
import utility.DButil;

public class StudentDao {
	
	public void getAllStudent() {
		String sql = "select * from student";
		Connection con = DButil.getMySqlDbConnection();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				
				int stdId = rs.getInt("roll_number");
				String stdName = rs.getString("student_name");
				String courseName = rs.getString("course");
				int duratioN = rs.getInt("duration");
				int stdAge = rs.getInt("age");
				
				System.out.println("StudentId"+stdId);
				System.out.println("StudentName:"+stdName);
				System.out.println("Course name"+ courseName);
				System.out.println("Course Duration"+duratioN);
				System.out.println("Student Age"+stdAge);
				System.out.println("--------------------------------------------------------");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void getStudent(int stdId) {
		
		String sql = "select * from student where roll_number=?";
		Connection con = DButil.getMySqlDbConnection();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, stdId);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				int rollNumber = rs.getInt("roll_number");
				String StdName = rs.getString("student_name");
				String courseName = rs.getString("course");
				int DuratioN = rs.getInt("duration");
				int stdAge = rs.getInt("age");
				
				System.out.println("Roll Number : " + rollNumber);
				System.out.println("Student Name : " + StdName);
				System.out.println("Course name : " + courseName);
				System.out.println("Course Duration : " + DuratioN);
				System.out.println("Student Age : " + stdAge);
				
			}else {
				System.out.println("Product not found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
public void getStudent(String stdName) {
		
		String sql = "select * from student where student_name=?";
		Connection con = DButil.getMySqlDbConnection();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, stdName);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				int rollNumber = rs.getInt("roll_number");
				String StdName = rs.getString("student_name");
				String courseName = rs.getString("course");
				int DuratioN = rs.getInt("duration");
				int stdAge = rs.getInt("age");
				
				System.out.println("Roll Number : " + rollNumber);
				System.out.println("Student Name : " + StdName);
				System.out.println("Course name : " + courseName);
				System.out.println("Course Duration : " + DuratioN);
				System.out.println("Student Age : " + stdAge);
				
			}else {
				System.out.println("Product not found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void addstudent(Student student) {
		
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
			if (result == 0) {
				System.out.println("Query Failed");
			} else {
				System.out.println("Success");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void deleteStudent(int rollNumber) {
		
		Connection con = DButil.getMySqlDbConnection();
		String sql = "delete from student where roll_number=?";
				
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, rollNumber);
			int result = pst.executeUpdate();
			if (result == 0) {
				System.out.println("Roll no not found");
				
			}else {
				System.out.println("Roll number Deleted!!");
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
//---------------------------------UPDATE---------------------	
	
	public void updateStudent(Student student) {
		Connection con = DButil.getMySqlDbConnection();
		String sql = "update student set  student_name=?, course=?, duration=?,age=? where roll_number=?";
		
		try {
			PreparedStatement pst= con.prepareStatement(sql);
			
			pst.setString(1, student.getStudentName());
			pst.setString(2, student.getCourseName());
			pst.setInt(3, student.getDurationOfCourse());
			pst.setInt(4, student.getAgeOfStd());
			pst.setInt(5, student.getRollNumber());
			
			int result = pst.executeUpdate();
			if (result == 0) {
				System.out.println("Student Roll number does not exist");
			}else {
				System.out.println("Successfully Updated");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
