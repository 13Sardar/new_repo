package day2.forLoop;
//Break-Continue with for loop
public class Example2 {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i==4) {
				break;
			}
		System.out.println(i);
		}
		
		for(int j=0;j<=5;j++) {
			if(j==4) {
				continue;
			}
			System.out.println(j);
		}
	}
}
