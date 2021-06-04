package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.EmailService;

import eCommerceDemo.entities.concretes.User;


//basit simulasyon
public class EmailManager implements EmailService {


	@Override
	public void sendEmail(User user) {
		System.out.println("Lutfen "+ user.getEmail()+ " adresine gonderilen "
				+ "aktivasyon linkine tiklayarak uyeliginizi aktif hale getiriniz.");
	}
}
	
	
