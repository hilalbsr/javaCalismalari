package adapters;

import java.rmi.RemoteException;

import abstracts.UserValidationService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserValidationService {

	@Override
	public boolean validate(Gamer gamer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = false;

		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(gamer.getIdentityNumber()),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getBirthYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return result;
	}

}
