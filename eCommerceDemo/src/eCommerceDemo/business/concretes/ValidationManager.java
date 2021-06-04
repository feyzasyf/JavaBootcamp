package eCommerceDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.ValidationService;
import eCommerceDemo.core.InvalidInfoException;
import eCommerceDemo.core.UserInfoNotFoundException;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class ValidationManager implements ValidationService {
	
	private UserDao userDao;
	
	public ValidationManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean validateForSignIn(User user) throws InvalidInfoException {
		
			
			if (user.getFirstName().isEmpty() || user.getLastName().isEmpty()) {
				throw new InvalidInfoException(1);
			}
			
			if(user.getEmail().isEmpty()) {
				throw new InvalidInfoException(2);
			}
			
			if(user.getPassword().isEmpty()) {
				throw new InvalidInfoException(3);
			}
			
			if(user.getPassword().length()<6) {
				throw new InvalidInfoException(4);
			}
			if(user.getFirstName().length()<2 || user.getLastName().length()<2) {
				throw new InvalidInfoException(5);
			}
			
			Pattern regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-Z0-9)]+\\.[(a-zA-Z)]{2,3}$");
	        Matcher regMatcher   = regexPattern.matcher(user.getEmail());
	        if(!regMatcher.matches()) {
	        	throw new InvalidInfoException(6);}
	      
			if(userDao.findByEmail(user.getEmail()) !=null) {
				throw new InvalidInfoException(7);
			}
			return true;
		}
	

	@Override
	public boolean validateForLogIn(User user) throws UserInfoNotFoundException{
		if (user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
			throw new UserInfoNotFoundException("Lutfen kullanici adinizi ve parolayi eksiksiz giriniz");
		}
		
		if(userDao.findByEmailAndPassword(user.getEmail(), user.getPassword()) == null) {
			throw new UserInfoNotFoundException("Hatali kullanici adi veya parola");
		}
		return true;
			
	}

}
