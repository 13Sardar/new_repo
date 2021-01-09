package day9.jdbc;

import java.sql.*;
import beans.Product;
import utility.DButil;

public class ProductDao {
	
	
	public void getAllProducts() {
		String sql = "select * from product";
		Connection con = DButil.getMySqlDbConnection();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				
				int productId = rs.getInt("product_Id");
				String ProductName = rs.getString("product_same");
				int price = rs.getInt("price");
				
				System.out.println("productId:"+productId);
				System.out.println("productName:"+ProductName);
				System.out.println("price:"+price);
				System.out.println("--------------------------------------------------------");
				
				
				
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}
	
	
	
	public void getProduct(int productId) {
		
		String sql = "select * from product where product_id=?";
		Connection con = DButil.getMySqlDbConnection();
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, productId);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				String productName = rs.getString("product_same");
				int price = rs.getInt("price");
				System.out.println("productId:" + productId);
				System.out.println("productName:" + productName);
				System.out.println("price:" + price);
			}else {
				System.out.println("Product not found");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public void addProduct(Product product) {
		System.out.println("Now inserting product in dataBase :" + product);
		Connection con = DButil.getMySqlDbConnection();
		String sql = "insert into product values (?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, product.getProductID());
			pst.setString(2, product.getProductName());
			pst.setInt(3, product.getPrice());
			
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
	
//-------------------------------------DELETE------------------------------------
	
	public void deleteProduct(int productId) {
		Connection con = DButil.getMySqlDbConnection();
		String sql = "delete from product where product_id=?";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, productId);
			int result = pst.executeUpdate();
			if(result == 0) {
				System.out.println("Could not find ProductId");
			}else {
				System.out.println("Product Id :\t"+productId+"\tDeleted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	//-------------------------------------UPDATE------------------------------------
	
	public void updateProduct(Product product) {
		Connection con = DButil.getMySqlDbConnection();
		String sql = "update product set product_same=?, price=? where product_id=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, product.getProductName());
			pst.setInt(2, product.getPrice());
			pst.setInt(3, product.getProductID());
			int result = pst.executeUpdate();
			if (result == 0) {
				System.out.println("The product with given id does not exist");
			} else {
				System.out.println("Successfully Updated");
			}
		} catch (Exception e) {
			System.out.println("Exception Occured:" + e);
		}
	}
	
	
	

}
