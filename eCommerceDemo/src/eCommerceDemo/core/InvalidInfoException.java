package eCommerceDemo.core;

public class InvalidInfoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	int errorType = 0;	

	public InvalidInfoException(int error) {		
		super("Lutfen bilgilerinizin dogrulugunu kontrol ediniz: ");
		this.errorType = error;
	}
	
	public String printMessage() {
		switch(errorType) {
		case 1:
			return("Isim, soyisim bos birakilamaz.");
			
		case 2:
			return ("Kayit icin e-posta adresi gereklidir.");
		case 3:
			return("Lutfen en az 6 karakterden olusan bir sifre olusturunuz.");
		
		case 4:
			return("Sifre en az 6 karakterden olusmalidir.");
			
		case 5:
			return("Isim ve Soyisim en az iki karakterden olusmalidir.");
		case 6:
			return("Gecersiz eposta adresi.");
		case 7:
			return("Bu eposta adresi sisteme kayitli.");
		
		
		}
		return("");
		
		
	
	}
}
