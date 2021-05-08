package inharitanceIntro;

public class StudentManager {

	public void addTakenCourse(Student student, String[] courseList) {
		String course = String.join("/", courseList);
		System.out.println(student.getName() + ", " + course + " kursunu da aldı.");
	}

}
