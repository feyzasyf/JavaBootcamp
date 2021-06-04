package eCommerceDemo.business.concretes;



import eCommerceDemo.business.abstracts.EmailService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.abstracts.ValidationService;
import eCommerceDemo.core.InvalidInfoException;
import eCommerceDemo.core.UserInfoNotFoundException;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private EmailService emailService;
	private ValidationService validationService;
	
	public UserManager(UserDao userDao, EmailService emailService, ValidationService validationService) {
		this.userDao = userDao;
		this.emailService= emailService;
		this.validationService = validationService;
		
	}

	@Override
	public void signUp(User user) {
		try {
			if(validationService.validateForSignIn(user)) {
					
			userDao.add(user);
			emailService.sendEmail(user);
			}			
			
		} catch (InvalidInfoException e) {
			System.out.print(e.getMessage());
			System.out.println(e.printMessage());
		}
		
		
	}
	
	
	
	@Override
	public void logIn(User user) {
		
		try {
			if(this.validationService.validateForLogIn(user)) {
			
			userDao.logIn(user);
			System.out.println("giris basarili");
			}
		}
		catch(UserInfoNotFoundException e)
		{
			System.out.print(e.getMessage());
		}
			
	}	                                                                                                                                                          
	
	
	
	@Override
	public void saveVerifiedUser(User user) {
		user.setEnabled(true);
		userDao.add(user);
	}
	
	

}
