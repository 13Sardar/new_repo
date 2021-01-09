package day8.jdbc;

import java.sql.*;

// insert data into login table using PreparedStatement
public class Example4 {
	public static void main(String[] args) {
		
		Connection con = getMySqlDbConnection();
		String sql = "insert into login values (? , ?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, "Thethi");
			pst.setString(2, "8090");
			int result = pst.executeUpdate(); 
			if (result == 0) {
				System.out.println("Insertion Failed");
			} else {
				System.out.println("Data Inserted Successfully");
			}
		} catch (Exception e) {
			System.out.println("Exception Occured:" + e);
		}
		
		
	}

	public static Connection getMySqlDbConnection() {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUserName = "root";
		String dbPassword = "root";
		Connection con = null;
		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, dbUserName, dbPassword);
			System.out.println("Connection: "+con);

		} catch (Exception e) {
			System.out.println("Exception while creating db connection:" + e);
		}
		return con;
	}

}