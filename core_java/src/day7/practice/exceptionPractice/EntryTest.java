package day7.practice.exceptionPractice;

public class EntryTest {
	
	public static void checkData(String dayName) throws GymEntryException{
		
		if (dayName.equalsIgnoreCase("Sunday")) {
			throw new GymEntryException("Entry Not Granted");
		} else {
			System.out.println("Entry Granted");
		}

	}
	
	public static void main(String[] args) {
		try {
			checkData("Monday");
		}catch(GymEntryException e) {
			System.out.println(e);
		}
	}

}
