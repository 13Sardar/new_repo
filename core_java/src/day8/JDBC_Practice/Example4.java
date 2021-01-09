package day8.JDBC_Practice;

import java.sql.*;
import utility.DButil;

public class Example4 {
	
	public static void main(String[] args) {
		Connection con = DButil.getMySqlDbConnection();
		String sql = "insert into student values (?,?,?,?,?)";
		
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, 5);
			pst.setString(2, "Gagan");
			pst.setString(3, "BE");
			pst.setInt(4, 4);
			pst.setInt(5, 23);
			int result = pst.executeUpdate();
			if(result == 0) {
				System.out.println("Could not insert value.");
			}
			else {
				System.out.println("Values Inserted.");
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
