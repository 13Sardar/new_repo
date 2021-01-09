package day8.JDBC_Practice;

import java.sql.*;

import utility.DButil;

public class Example1 {
	public static void main(String[] args) {
		
		Connection con = DButil.getMySqlDbConnection();
		
		String sql ="select * from student";
		
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				
				int rollNumber = rs.getInt("roll_number");
				String studentName = rs.getString("student_name");
				String courSE = rs.getString("course");
				int duratioN = rs.getInt("duration");
				int agE = rs.getInt("age");
				System.out.println("Roll number :"+rollNumber);
				System.out.println("Student Name :"+studentName);
				System.out.println("Course Name :"+ courSE);
				System.out.println("Duration :"+ duratioN);
				System.out.println("Student Age :"+agE);
				System.out.println("=================");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
