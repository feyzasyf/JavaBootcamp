package eCommerceDemo.business.abstracts;

import eCommerceDemo.core.InvalidInfoException;
import eCommerceDemo.core.UserInfoNotFoundException;
import eCommerceDemo.entities.concretes.User;

public interface ValidationService {

	boolean validateForSignIn(User user) throws InvalidInfoException;
	boolean validateForLogIn(User user) throws UserInfoNotFoundException;
}
