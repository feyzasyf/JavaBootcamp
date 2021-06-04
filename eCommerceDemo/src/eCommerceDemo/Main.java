package eCommerceDemo;


import eCommerceDemo.business.concretes.EmailManager;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.business.concretes.ValidationManager;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User(1,"isimm","soyisim","email@email.com", "666666666", false);
		
		UserManager serv = new UserManager(new HibernateUserDao(), new EmailManager(), new ValidationManager(new HibernateUserDao()));
		serv.signUp(user);
	}

}
