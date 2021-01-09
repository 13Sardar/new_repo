package day7.fileHandeling;

import java.util.*;
import java.io.*;

public class Example3 {
	public static void main(String[] args) {
		File file = new File("Course.txt");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				String x =sc.nextLine();
				System.out.println(x);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Catch File");
			e.printStackTrace();
		}
		
	}
}
