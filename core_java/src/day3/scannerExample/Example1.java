package day3.scannerExample;
import java.util.Scanner;
public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner age = new Scanner(System.in);
		
		System.out.println("Enter User Name and age");
		String userName = sc.nextLine();
		int userAge = age.nextInt();
		System.out.println("User Name : "+userName +"\t Age"+userAge);
		
		
		
	}

}
