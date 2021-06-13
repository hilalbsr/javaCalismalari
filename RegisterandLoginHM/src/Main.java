import business.abstracts.AuthService;
import business.concretes.AuthManager;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AuthService autService = new AuthManager(new UserManager(new HibernateUserDao()));

		User user = new User(1, "hasan", "ahmet", "hasan@mail.com", "234", true);
		autService.register(user);
		
		User user1 = new User(1, "Hilal", "Bodur", "hilal@mail.com", "234", true);
		autService.register(user1);

	}

}
