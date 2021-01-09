/* Write a java code to check if the user is present in the database or Not. If the user is present, check the corresponding password*/

package day8.jdbc;

import java.sql.*;
import utility.DButil;

public class Example6 {


	public static void main(String[] args) {
		
		Connection con = DButil.getMySqlDbConnection();
		String userName = "zensar";
		String password = "pune11";

		String sql = "select * from login where user_name=?";
		
		try {
			PreparedStatement pst =  con.prepareStatement(sql);
			pst.setString(1, userName);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
//				System.out.println("User Found");
			String passwordFromDB = rs.getString("password");
				if(password.equals(passwordFromDB)) {
					System.out.println("Login Successful");
				}else {
					System.out.println("Login Failed");
				}
			
			}else {
				System.out.println("User Nout Found");
			}
			
			/*
			while(rs.next()) {
				String passwordFromDB = rs.getString("password");
				if(password.equals(passwordFromDB)) {
					System.out.println("Login Successful");
				}else {
					System.out.println("Login Failed");
				}
			}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
