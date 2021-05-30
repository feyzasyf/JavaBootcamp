package gameDemo.concretes;

import gameDemo.abstracts.SaleService;
import gameDemo.entities.Campaign;
import gameDemo.entities.Game;
import gameDemo.entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void purchase(Gamer gamer, Game game) {
		System.out.println(gamer.getNickname() + " has purchased "+ game.getName()+" for the price of "+ game.getPrice());		
	}

	@Override
	public void saleWithCampaign(Game game, Campaign campaign) {
		
		System.out.println(campaign.getCampaignName()+ " has started. You can now purchase "
		+game.getName()+ " with a discount rate of: " + campaign.getDiscountRate());
		
	}

}
