package concretes;

import abstracts.UserValidationService;
import entities.Gamer;

public class GamerCheckManager implements UserValidationService {

	@Override
	public boolean validate(Gamer gamer) {

		return true;
	}

}
