package gameDemo.abstracts;

import gameDemo.entities.Campaign;
import gameDemo.entities.Game;
import gameDemo.entities.Gamer;

public interface SaleService {

	void purchase(Gamer gamer, Game game);
	void saleWithCampaign(Game game, Campaign campaign);
}
