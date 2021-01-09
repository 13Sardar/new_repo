package day1.switches;

public class Example2 {
	public static void main(String[] args) {
		
		int num = 28;
		String s;
		
		switch(num) {
		
		case 28:
			s = "Small";
			break;
		case 30:
			s = "Medium";
			break;
		case 32:
			s = "Large";
			break;	
		case 34:
			s = "E-Large";
			break;
		default:
			s = "Unknown";
			break;
			
			
		}
		System.out.println("Size : " + s);
		
	}

}
