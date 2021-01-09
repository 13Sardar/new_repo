package day2.forLoop;

public class Example3 {
	public static void main(String[] args) {
		int i = 0,j=0;
		while (i < 10) {
		  System.out.println(i);
		  i++;
		  if (i == 4) {
		    break;
		  }
		}
		
		while(j<10) {
			System.out.println(j);
			j++;
			if(j==4) {
				continue;
			}
		}
		
	}

}
