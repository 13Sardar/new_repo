//Keshav_93012
package day6.beans;

public class Cricketer {
	private int jerseyno ;
	private String name;
	
	public Cricketer()
	{
		
	}

	@Override
	public String toString() {
		return "Cricketer [jerseyno=" + jerseyno + ", name=" + name + "]";
	}

	public Cricketer(int jerseyno, String name) {
		super();
		this.jerseyno = jerseyno;
		this.name = name;
	}

	public int getJerseyno() {
		return jerseyno;
	}

	public void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
