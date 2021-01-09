package day7.practice.filehandling;
import java.io.*;

public class AllCombine {
	public static void main(String[] args) {
		
		try {
			File folder= new File("FileHandlingFolder");
		folder.mkdir();
		
		File file = new File("D:\\Java Training\\30_11\\core_java\\FileHandlingFolder\\textFile.txt");
		boolean result = file.createNewFile();
//		boolean fileexist = file.exists();
		
		if(result) {
			FileWriter writeFile = new FileWriter("D:\\Java Training\\30_11\\core_java\\FileHandlingFolder\\textFile.txt");
			writeFile.write("Hello World!!");
			writeFile.close();
			System.out.println("Task Completed check file");
		}else {
			System.out.println("Create a File");
		}
		
		}
		catch(Exception e) {
			System.out.println(" Exception Occured \t"+e);
		}
		
		
	}

}
