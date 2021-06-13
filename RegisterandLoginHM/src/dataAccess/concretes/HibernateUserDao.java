package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public List<User> getAll() {
		return null;
	}

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + "  is added.");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " is updated.");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " is deleted.");
	}

}
