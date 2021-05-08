package inharitanceIntro;

public class Instructor extends User {
	String taxNumber;
	String[] givenCourse;

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String[] getGivenCourse() {
		return givenCourse;
	}

	public void setGivenCourse(String[] givenCourse) {
		this.givenCourse = givenCourse;
	}

}
