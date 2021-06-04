package eCommerceDemo.business.abstracts;



import eCommerceDemo.entities.concretes.User;

public interface UserService {
void signUp(User user);
void logIn(User user);
void saveVerifiedUser(User user);


}
