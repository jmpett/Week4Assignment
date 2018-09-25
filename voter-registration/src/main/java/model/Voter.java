package model;

public class Voter {
	private String name;
	private int DOBMonth;
	private int DOBDay;
	private int DOBYear;
	
	public Voter() {
		
	}
	
	public Voter(String name, int day, int month) {
		this.name = name;
		this.DOBDay = day;
		this.DOBMonth = month;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;

	}

	public int getDOBMonth() {
		return DOBMonth;
	}

	public void setDOBMonth(int dOBMonth) {
		DOBMonth = dOBMonth;
	}

	public int getDOBDay() {
		return DOBDay;
	}

	public void setDOBDay(int dOBDay) {
		DOBDay = dOBDay;
	}

	public int getDOBYear() {
		return DOBYear;
	}

	public void setDOBYear(int dOBYear) {
		DOBYear = dOBYear;
	}

	@Override
	public String toString() {
		return "Voter [name=" + name + ", Date of Birth=" + DOBMonth + "/" + DOBDay + "/" + DOBYear + "]";
	}
	
}
