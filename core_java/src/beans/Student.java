package beans;

public class Student {
	
	private int rollNumber;
	private String studentName;
	private String courseName;
	private int durationOfCourse;
	private int ageOfStd;
	
	public Student() {
		
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDurationOfCourse() {
		return durationOfCourse;
	}

	public void setDurationOfCourse(int durationOfCourse) {
		this.durationOfCourse = durationOfCourse;
	}

	public int getAgeOfStd() {
		return ageOfStd;
	}

	public void setAgeOfStd(int ageOfStd) {
		this.ageOfStd = ageOfStd;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", courseName=" + courseName
				+ ", durationOfCourse=" + durationOfCourse + ", ageOfStd=" + ageOfStd + "]";
	}

	public Student(int rollNumber, String studentName, String courseName, int durationOfCourse, int ageOfStd) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.courseName = courseName;
		this.durationOfCourse = durationOfCourse;
		this.ageOfStd = ageOfStd;
	}
	
	
	
}
