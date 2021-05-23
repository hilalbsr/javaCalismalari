import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		baseCustomerManager.save(new Customer(1, "hilal büşra", "bodur", LocalDate.of(1992, 1, 4), "22222222220"));
	}

}
