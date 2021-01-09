package day9.jdbc;

import java.sql.*;
import beans.Product;
import utility.DButil;

public class Example1 {
	public static void main(String[] args) {
		
		Product product1 = new Product(2,"Mobile",30000);
		ProductDao example1 = new ProductDao();
		
		Product product = new Product(1,"Table",12666);
		example1.updateProduct(product);
//		example1.deleteProduct(2);
//		example1.getAllProducts();
//		example1.getProduct(3);
//		example1.addProduct(product1);
		
		
	}
}
