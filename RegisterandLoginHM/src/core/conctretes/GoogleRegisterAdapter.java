package core.conctretes;

import Google.GoogleRegisterManager;
import core.abstracts.GoogleRegisterService;

public class GoogleRegisterAdapter implements GoogleRegisterService {
	@Override
	public void googleRegister(String message) {
		GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
		googleRegisterManager.send(message);
	}
}