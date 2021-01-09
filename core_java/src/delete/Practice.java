package delete;

abstract class AbstractClass{
	private String str1;
	String value1;
	
	AbstractClass(String label, int num){
		str1=""+num;
		value1 = label;
	}

	String getLabel() {
		return str1;
	}
	abstract String getNumber();
}
	class Practice extends AbstractClass {
		
		Practice(String label, int num){
			super(label,num);
			
		}
		String getNumber() {
			return value1;
		}
	}


	
	