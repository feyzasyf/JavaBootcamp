package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

//Aktivasyon maili gonderme simulasyonu
public interface EmailService {
void sendEmail(User user);
	
	
}
