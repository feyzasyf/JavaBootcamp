package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Concrete.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result= false;
	        try {
	          return result= client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
	        }catch (NumberFormatException | RemoteException e){
	            e.printStackTrace();
	        }
	        return result;
		
		
		
	}

}
