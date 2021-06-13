package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import core.abstracts.GoogleRegisterService;
import entities.concretes.User;

public class AuthManager implements AuthService {

	public static final Pattern EMAIL_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	private UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {

		if (requiredControl(user)) {
			if (!userService.isEmailUsed(user.getEmail()))
				if (emailControl(user.getEmail())) {
					if (user.isConfirmLink()) {
						userService.add(user);
						System.out.println("Confirm link sent to " + user.getEmail() + " email.");
					} else
						System.out.println(user.getFirstName() + " register is success.");
				}
		}
	}

	@Override
	public void login(String email, String password) {
		if (userService.getUser(email, password) != null) {
			System.out.println("You have successfully logged in.");
		} else {
			System.out.println("Email address or password is incorrect! Please try again.");
		}
	}

	public boolean requiredControl(User user) {

		if (user.getFirstName().trim().equals("") || user.getLastName().trim().equals("")
				|| user.getEmail().trim().equals("") || user.getPassword().trim().equals("")) {
			System.out.println("Name, Surname, Email and Password is required.");
			return false;
		}

		if (user.getFirstName().trim().length() < 1 || user.getLastName().trim().length() < 1) {
			System.out.println("Name and Surname must be longer than 2 characters.");
			return false;
		}

		return true;
	}

	public boolean emailControl(String email) {
		Matcher matcher = EMAIL_REGEX.matcher(email);
		return matcher.find();
	}

	public boolean isVerificationLink(String email) {
		return true;
	}
}
