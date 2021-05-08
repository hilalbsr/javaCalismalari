package inharitanceIntro;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getName() + " " + user.getLastName() + ", " + user.getUserType() + " olarak eklendi.");
	}
}
