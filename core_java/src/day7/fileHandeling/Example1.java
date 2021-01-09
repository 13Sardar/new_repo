package day7.fileHandeling;

import java.io.*;

public class Example1 {
	public static void main(String[] args) {
		
		try {
			File file = new File("Course.txt");
			boolean result = file.createNewFile();
			if(result) {
				System.out.println("File Successfully Created :\t" + file.getName());
			}
			else {
				System.out.println("File Already Exists");
			}
			
			
		}catch(Exception e){
			System.out.println("An Error Occured");
		}
	}

}
