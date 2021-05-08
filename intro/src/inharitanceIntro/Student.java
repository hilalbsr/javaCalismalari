package inharitanceIntro;

public class Student extends User{
	String studentNo;
	String[] takenCourses;

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String[] getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(String[] takenCourses) {
		this.takenCourses = takenCourses;
	}

}
