//Print String in reverse "letter by letter".


package day2.gaganExamples;
//Reverse a string letter by letter
public class Example12 {
	public static void main(String[] args) {
		String ip= "Gagan";
		int y;
		char[] try1 = ip.toCharArray();
//		x=ip.length();
		y=try1.length;
		for(int i=y-1;i>=0;i--) {
			System.out.println(try1[i]);
			
		}
			
	}

}
