package Abstract;

import Entities.Concrete.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db: "+ customer.getFirstName()+ " "+ customer.getDateOfBirth());
		
	}

}
