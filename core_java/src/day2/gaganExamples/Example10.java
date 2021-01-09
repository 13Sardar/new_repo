//Sort an array, and print minimum and maximum value.


package day2.gaganExamples;

public class Example10 {
	public static void main(String[] args) {
		int a[]= {10,30,5};
		int x=a.length;
		int temp=0;
		for(int i=0;i<x;i++) {
			for(int j=i+1;j<x;j++) {
				if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			System.out.println(a[i]);
			
		}
		
		System.out.println("Greaatest "+a[0]);
		System.out.println("Smallest "+a[x-1]);
		
		
	}
}
