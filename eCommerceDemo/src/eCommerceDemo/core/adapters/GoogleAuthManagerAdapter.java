package eCommerceDemo.core.adapters;

import eCommerceDemo.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {
	GoogleAuthManager googleAuthManager = new GoogleAuthManager();
	
	@Override
	public void LogInToGoogle(String email, String password) {
				
		googleAuthManager.LogIn(email, password);
		
	}

}
