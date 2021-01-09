/**
*
* Write a Java program to find sum of values of a given array.
*
*/

package day2.gaganExamples;

public class Example7 {
	public static void main(String[] args) {
		int sum=0,avg=0;
		int[] marks = {69, 85, 66, 80, 81 };
		int x =marks.length;
		for(int i=0;i<marks.length;i++) {
			
			sum += marks[i];
			avg = (sum/x);
		}

		System.out.println(sum);
		System.out.println(avg);
	//	System.out.println(average(marks , x));
	}

}
