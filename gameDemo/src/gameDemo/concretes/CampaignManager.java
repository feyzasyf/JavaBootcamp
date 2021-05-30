package gameDemo.concretes;

import gameDemo.abstracts.CampaignService;
import gameDemo.entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign: " + campaign.getCampaignName()+" successfully added.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign: " + campaign.getCampaignName()+" successfully deleted.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign: " + campaign.getCampaignName()+" successfully updated.");
		
	}

}
