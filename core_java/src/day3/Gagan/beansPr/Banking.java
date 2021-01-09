package day3.Gagan.beansPr;

public class Banking {
	
	private int bankId;
	private String bankName;
	private String empName;
	
	public Banking() {
		
	}
	
	
	public Banking(int bankId, String bankName, String empName) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.empName = empName;
		
		
		
		
		
		
	}


	public int getBankId() {
		return bankId;
	}


	public void setBankId(int bankId) {
		this.bankId = bankId;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	@Override
	public String toString() {
		return "Banking [bankId=" + bankId + ", bankName=" + bankName + ", empName=" + empName + "]";
	}
	
	
	
	

}
