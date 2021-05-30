package gameDemo.concretes;

import gameDemo.abstracts.GamerService;
import gameDemo.adapters.IdentityCheckService;
import gameDemo.entities.Gamer;

public class GamerManager implements GamerService{
	
	private  IdentityCheckService idCheckService;
	
	
	public GamerManager(IdentityCheckService idCheckService) {
		this.idCheckService=idCheckService;
	}

	@Override
	public void register(Gamer gamer) {
		if(idCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Gamer successfully registered.");
		}
		else {
			System.out.println("Invalid person.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer successfully deleted.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer successfully updated.");
		
	}

}
