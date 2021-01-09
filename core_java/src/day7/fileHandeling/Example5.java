package day7.fileHandeling;

import java.io.*;

//creating a folder and then deleting it
public class Example5 {

	public static void main(String[] args) {
		try {
			File folder = new File("test101");
			folder.mkdir();

			boolean result = folder.exists();
			if (result) {
				System.out.println("Folder named test1 exists");
				System.out.println("Now we are going to delete it.");
				
				folder.delete();
				System.out.println("Deleted Successfully");
				
			} else {
				System.out.println("Folder named test1 does not exists");
			}
		} catch (Exception e) {
			System.out.println("Exception Occured:" + e);
		}
	}
}
