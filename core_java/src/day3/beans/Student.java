package day3.beans;

public class Student {
	
	private int rollNumbers;
	private String studentsName;
	private String course;
	
	public Student() {
		
	}

	public Student(int rollNumbers, String studentsName, String course) {
		super();
		this.rollNumbers = rollNumbers;
		this.studentsName = studentsName;
		this.course = course;
	}




	public int getRollNumbers() {
		return rollNumbers;
	}

	public void setRollNumbers(int rollNumbers) {
		this.rollNumbers = rollNumbers;
	}

	public String getStudentsName() {
		return studentsName;
	}

	public void setStudentsName(String studentsName) {
		this.studentsName = studentsName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollNumbers=" + rollNumbers + ", studentsName=" + studentsName + ", course=" + course + "]";
	}
	
}
