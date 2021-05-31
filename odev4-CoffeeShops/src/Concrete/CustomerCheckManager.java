package Concrete;

import Abstract.CustomerCheckService;

import Entities.Concrete.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
		
	}

}
