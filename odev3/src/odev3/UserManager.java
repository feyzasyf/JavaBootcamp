package odev3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName() +" eklendi.");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName() +" silindi.");
	}


}
