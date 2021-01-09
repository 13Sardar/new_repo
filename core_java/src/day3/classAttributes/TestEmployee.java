package day3.classAttributes;

public class TestEmployee {
	public static void main(String[] args) {
		//Default constructor
		Employee employee = new Employee();
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		
		System.out.println("Updating Values...........................");
		employee.setEmployeeId(20010);
		employee.setEmployeeName("Zensar");
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		
		//Parameterized Constructor
		System.out.println("Creating object with parameterized constructor...");
		Employee employee2 = new Employee(5001, "David");
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee2.getEmployeeName());
		
		System.out.println("*************************************************************************");
		
		System.out.println(employee2);
		
		
		
		
	}

}
