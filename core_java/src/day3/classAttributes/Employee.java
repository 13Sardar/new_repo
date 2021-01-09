package day3.classAttributes;

public class Employee {

	private int employeeId;
	private String employeeName;
	
	public Employee() {
		
	}

	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}




	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


//before putting toString we were getting the address of employee2, after this we will get the values of employee2..
//There is an Object classs in JAVA which is Over to all the class, 
//So when we call "toString" @Override will appear, also if we remove this, it wont effect, its just for the user to know.
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
	
	
}
