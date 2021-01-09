package day2.arrays;

public class Example5 {
	public static void main(String[] args) {
		String name[] = {"Name","A","B","C","D","E"};
		int age[] = {0,10,20,30,40,50};
		name[3] = "Z";
		age[3] = 100;
		for(int i=0;i<5;i++) {
			System.out.println(age[i] +"\t"+ name[i]);
		}
	}

}
