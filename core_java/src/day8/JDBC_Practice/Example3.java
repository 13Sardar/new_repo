package day8.JDBC_Practice;

import java.sql.*;
import utility.DButil;

public class Example3 {
	
	public static void main(String[] args) {
		Connection con = DButil.getMySqlDbConnection();
		String sql = "insert into student values (4,'Pushpak','Law',3,25)";
		
		
		try {
			Statement st = con.createStatement();
			int result = st.executeUpdate(sql);
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
