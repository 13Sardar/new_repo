package day3.beans;

public class School {
	private int stdId;
	private String stdName;
	private String stdSection;
	private double stdContact;
	
	public School() {
		
	}

	public School(int stdId, String stdName, String stdSection, double stdContact) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdSection = stdSection;
		this.stdContact = stdContact;
	}



	public int getStdId() {
		return stdId;
	}



	public void setStdId(int stdId) {
		this.stdId = stdId;
	}



	public String getStdName() {
		return stdName;
	}



	public void setStdName(String stdName) {
		this.stdName = stdName;
	}



	public String getStdSection() {
		return stdSection;
	}



	public void setStdSection(String stdSection) {
		this.stdSection = stdSection;
	}



	public double getStdContact() {
		return stdContact;
	}



	public void setStdContact(double stdContact) {
		this.stdContact = stdContact;
	}



	@Override
	public String toString() {
		return "School [stdId=" + stdId + ", stdName=" + stdName + ", stdSection=" + stdSection + ", stdContact="
				+ stdContact + "]";
	}
	
}
