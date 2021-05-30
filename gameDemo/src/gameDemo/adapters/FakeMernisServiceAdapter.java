package gameDemo.adapters;

import gameDemo.entities.Gamer;


public class FakeMernisServiceAdapter implements IdentityCheckService{

	//Mernis Sistemi entegrasyonu simulasyonu
	
	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
	//simulasyon

		//KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		 
	      //  try {
	      //    return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalId()),gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());
	      //  }catch (NumberFormatException | RemoteException e){
	      //      e.printStackTrace();
	      //  }
		return true;
	}

}
