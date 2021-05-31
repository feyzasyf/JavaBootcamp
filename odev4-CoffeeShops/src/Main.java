import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;

import Concrete.StarbucksCustomerManager;
import Entities.Concrete.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"feyza","syf",LocalDate.of(1985,7,07),"1345678912"));
		
		
		

	}

}
