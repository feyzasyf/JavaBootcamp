package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Concrete.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {
	CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}


	public void save(Customer customer){
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			throw new RuntimeException("Not a valid person");
			
		}
			
		  
	}
	
	
}
