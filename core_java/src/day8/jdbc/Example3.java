package day8.jdbc;


import java.sql.*;

// insert data into login table using Statement
public class Example3 {
	public static void main(String[] args) {
		
		Connection con = getMySqlDbConnection();
		String sql = "insert into login values ('frontdesk', '0123')";
		try {
			Statement st = con.createStatement();
			int result = st.executeUpdate(sql); // this method can be used for insert/update/delete queries
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