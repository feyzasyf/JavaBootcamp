package Abstract;

import Entities.Concrete.Customer;

public interface CustomerCheckService {
boolean checkIfRealPerson(Customer customer);
}
