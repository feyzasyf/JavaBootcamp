package gameDemo;

import java.time.LocalDate;
import gameDemo.adapters.FakeMernisServiceAdapter;
import gameDemo.concretes.CampaignManager;
import gameDemo.concretes.GameManager;
import gameDemo.concretes.GamerManager;
import gameDemo.entities.Campaign;
import gameDemo.entities.Game;
import gameDemo.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer=new Gamer(1, "CrazYForYou", "leyla","mecnun", LocalDate.of(1990,12,30), "12345678910");
		  
		Game game=new Game(1,"Skrim", "fantastic game", 666);
		
		
		Campaign campaign=new Campaign(1,"Annual Sale Campaign","Our most popular games all 50% off for a limited time.", 50);
		
	    GamerManager gamerManager=new GamerManager(new FakeMernisServiceAdapter());
		gamerManager.register(gamer);
	
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.update(campaign);

		GameManager gameManager=new GameManager();
		gameManager.delete(game);
		

	}

}
