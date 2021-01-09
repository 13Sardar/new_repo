/* Write a java code to check if the password of a user is correct, if the password is correct, print login successful, otherwise failed*/

package day8.jdbc;

import java.sql.*;
import utility.DButil;

public class Example5 {


	public static void main(String[] args) {
		
		Connection con = DButil.getMySqlDbConnection();
		String userName = "zensar";
		String password = "pune";

		String sql = "select * from login where user_name=?";
		
		try {
			PreparedStatement pst =  con.prepareStatement(sql);
			pst.setString(1, userName);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String passwordFromDB = rs.getString("password");
				if(password.equals(passwordFromDB)) {
					System.out.println("Login Successful");
				}else {
					System.out.println("Login Failed");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
