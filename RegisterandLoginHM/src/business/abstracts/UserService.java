package business.abstracts;

import java.util.ArrayList;

import entities.concretes.User;

public interface UserService {

	void add(User user);

	void update(User user);

	void delete(User user);

	boolean isEmailUsed(String email);

	ArrayList<User> getAll();
	
	User getUser(String email, String password);
	
}
