package day8.JDBC_Practice;
import java.sql.*;

import utility.DButil;
public class Example6 {
	public static void main(String[] args) {
		
		Connection con = DButil.getMySqlDbConnection();
		String sql = "select * from student where student_name =?";
		
		String studentName = "Karan";
		int rollNumber = 7;
		
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, studentName);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				
				int rollNumberDB = rs.getInt("roll_number");
				if(rollNumberDB == rollNumber) {
					System.out.println("Name and ID matched");
				}
				else {
					System.out.println("Name and ID Miss-Match.");
				}
				
			}
			else {
				System.out.println("Student Not found");
			}
			
			
			
			/*
			while(rs.next()) {
				int rollNumberDB = rs.getInt("roll_number");
				if(rollNumberDB == rollNumber) {
					System.out.println("Name and ID matched");
				}
				else {
					System.out.println("Name and ID Miss-Match.");
				}
				
			}*/
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

}
