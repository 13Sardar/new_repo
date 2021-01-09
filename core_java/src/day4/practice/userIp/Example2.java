package day4.practice.userIp;

import java.util.ArrayList;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);		
		Scanner sc2 = new Scanner(System.in);
		
		ArrayList<String> studentName = new ArrayList<String>();
		
		boolean flag=true;
		while(flag==true) {
			
			System.out.println("To Enter a new Student in list Press 1, otherwise 0");
			int n,i;
			
			n=sc1.nextInt();
			
			if(n==1) {
				
				for(i=0;i<=n-1;i++) {
				
					System.out.println("Enter New Student Name : ");
					String name= sc2.nextLine();
					studentName.add(name);
				
				}
				
				System.out.println(studentName);
				
			}else {
				
				System.out.println("No new Change in List. Final List : \t"+studentName);
				flag=false;
			
			}
		}
	}
}
