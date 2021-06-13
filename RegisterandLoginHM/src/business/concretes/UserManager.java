package business.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	public ArrayList<User> userList = new ArrayList<User>();

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userList.add(user);
		userDao.add(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public boolean isEmailUsed(String email) {

		for (User user : userList) {
			if (user.getEmail().equals(email)) {
				System.out.println("Valid email! Please logIn.");
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<User> getAll() {
		return userList;
	}

	@Override
	public User getUser(String email, String password) {
		for (User user : userList) {
			if (user.getEmail().equals(email) && user.getEmail().equals(password)) {
				return user;
			}
		}
		
		return null;
	}

}
