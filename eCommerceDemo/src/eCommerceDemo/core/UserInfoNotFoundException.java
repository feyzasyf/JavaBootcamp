package eCommerceDemo.core;

public class UserInfoNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public UserInfoNotFoundException() {
		super();
	}
	public UserInfoNotFoundException(final String errorMessage) {
		super(errorMessage);
	}
	
}
