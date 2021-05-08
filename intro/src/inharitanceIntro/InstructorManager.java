package inharitanceIntro;

public class InstructorManager {
	public void addGivenCourse(Instructor inst, String[] courseList) {
		String course = String.join("/", courseList);
		System.out.println(inst.getName() + ", " + course + " kursunu da vermeye başladı.");
	}
}
