package day2.arrays;

public class Example8 {
	public static void main(String[] args) {
		int[][] nums = {{40,30,20},{11,22,33}};
		
		for(int i=0;i<nums.length;i++) {
			int[] innerArray= nums[i];
			System.out.println("\n");
			
			for(int j=0;j<innerArray.length;j++)
				System.out.println(innerArray[j]);
		}
			
	}

}
