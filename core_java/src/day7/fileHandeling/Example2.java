package day7.fileHandeling;

import java.io.*;

public class Example2 {
	public static void main(String[] args) {
		try {
		FileWriter fileWriter = new FileWriter("Course.txt");
		fileWriter.write("Core ");
		fileWriter.close();
		System.out.println("Successfully Written in file. ");
		
		
		}
		catch(Exception e){
			System.out.println(" Exception Occured \t"+e);
		}
	}
}
