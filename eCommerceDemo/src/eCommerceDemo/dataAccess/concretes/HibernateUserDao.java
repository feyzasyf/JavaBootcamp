package eCommerceDemo.dataAccess.concretes;

import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kullanici veri tabanina eklendi: " + user.getFullName());
		
	}

	@Override
	public void update(User user) {	}

	@Override
	public void delete(User user) {	}

	@Override
	public User findByEmail(String email) {
		//kod
		return null;
	}
	
	@Override
	public void logIn(User user) {
		
	}

	@Override
	public User findByEmailAndPassword(String email, String password) {
		
		return null;
	}

	@Override
	public User getUser(int id) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

	

}
