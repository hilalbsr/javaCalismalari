package adapters;

import abstracts.CustomerCheckService;
import entities.Customer;
import sun.tools.jconsole.Messages;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;

		try {
			
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationlityId()),customer.getName(),customer.getSurname(), customer.getDateOfBirth().getYear());		

		} catch (Exception e) {
			System.out.println("Not a valid person");
		}

		return result;
	}

}
