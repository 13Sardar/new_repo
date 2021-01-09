/**
*
Write a program that prints the integers from 1 to 100.
But for multiples of 3 print "Fizz" instead of the
number, and for the multiples of 5 print "Buzz".
For numbers which are multiples of both 3 and 5
print "FizzBuzz".
For the rest, print the actual number
*
*/

package day2.gaganExamples;

public class Example6 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
		//	System.out.println(i);
		//int i=15;
			if(i%5==0 && i%3==0) {
				System.out.println(i+"		fizzbuzz");
			}
			else if(i%3==0) {
				System.out.println(i+"		Fizz");
			}
			else if(i%5==0) {
				System.out.println(i+"		Buzz");
				
			}
		/*	else if(i%5==0 && i%3==0) {
				System.out.println(i+"  fizzbuzz");
			}*/
		}
	}
}
