/**
*
* Write a Java program to check if a given element exists in the array or not,
* int[] salaries = {20000, 25000, 55000, 47000, 38000};
* int salaryToFind = 55000;
*
*/

package day2.gaganExamples;

public class Example8 {
	public static void main(String[] args) {
		int [] sal = {20000,30000,55000,47000,38000};
		int saltf = 55000;
		int x = sal.length;
		boolean found=false;

		for(int i=0;i<x;i++) {
			if(sal[i]==saltf) {
				found = true;
				break;
			}
		}
		if(found) {
				System.out.println("Found");
			}
			else {
				System.out.println("NotFound");
			}
		}
		
}


