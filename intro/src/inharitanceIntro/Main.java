package inharitanceIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instructor ins = new Instructor();
		ins.setId(1);
		ins.setName("Hilal");
		ins.setLastName("Büşra");
		String[] givenCourseList = { "Java", "C#" };
		ins.setGivenCourse(givenCourseList);
		ins.setUserType(UserType.Student);

		Student std = new Student();
		std.setId(2);
		std.setName("Ali");
		std.setLastName("Veli");
		String[] takenCourseList = { "ASP", "JAVASCRIPT" };
		std.setTakenCourses(takenCourseList);
		std.setUserType(UserType.Instructor);

		UserManager userManager = new UserManager();
		userManager.add(ins);
		userManager.add(std);

		StudentManager stdManager = new StudentManager();
		String[] newCourse = { "Katmanlı Mimari","Yazılım" };
		stdManager.addTakenCourse(std, newCourse);
		
		InstructorManager insManager = new InstructorManager();
		String[] giveNewCourses = {"Yazılım Gereksinimleri", "Yazılım Prensipleri"};
		insManager.addGivenCourse(ins, giveNewCourses);
	}

}
