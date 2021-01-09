//reverse a number using methods
package day2.gaganExamples;

public class Example11 {
	public static int revnum(int x) {
		int rnum=0;
		int n;
		while(x>0) {
			n=x%10;//9
			rnum=rnum*10+n;//0*10+9
			x=x/10;//12345678
		}
		return rnum;
		
	}

}
