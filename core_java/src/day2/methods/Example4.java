package day2.methods;
//Remove Static from created methods (add and sub)

public class Example4 {
	public int add(int x, int y) {
		int z=x+y;
		return z;
	}
		
		public int sub(int x, int y) {
			int z=x-y;
			return z;
		
		
	}
	public static void main(String[] args) {
		//Create objects to call values in non-static methods.
		//So create object of Example4

		Example4 example4 = new Example4();
		
		int r1 = example4.add(2,3);
		int r2 = example4.sub(3,1);
		System.out.println(r1);
		System.out.println(r2);
		
		
	}
}
