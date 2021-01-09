package day2.arrays;
//@D ARRAYS
public class Example6 {
	public static void main(String[] args) {
		int[][] nums = {{40,30,20},{11,22,33}};
		int[] fir = nums[0];
		int[] sec = nums[1];
		
		for(int i=0;i<fir.length;i++) {
			System.out.println(fir[i]);
		}
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		for(int i=0;i<sec.length;i++) {
			System.out.println(sec[i]);
		}
	}

}
