package day1.strings;

public class Example9 {
	public static void main(String[] args) {
		
		String str1 = "okay";
		String str2 = new String(str1);
		String str3 = str1;
		System.out.println(str1==str3);
		System.out.println(str1==str2);
		
		String str4 = "okay";
		
		System.out.println(str1==str4);
		
		 String str5 = new String("okay");
	        String str6= str5;
//	        String str2 = new String(str1);
	        System.out.println(str5==str6);
	        
	        
	        
	        String str7 = new String("okay");
	        String str8 = new String(str7);
	        System.out.println(str7.equals(str8));
	        
	        String str9 = new String("okay");
	        String str10 = new String(str9);
	        System.out.println(str9==str10);
		
		
		
	}

}
