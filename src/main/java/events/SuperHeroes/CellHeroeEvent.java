package events.SuperHeroes;

import campaign.Campaign;
import economy.Economy;
import events.Event;

public class CellHeroeEvent extends Event{
    private final String description;

    public CellHeroeEvent() {
        super();
        this.description = "Une cellule souche des super héros a été découverte et la transmission dans un rat de laboratoire fut un succès PHENOMENAL";
        this.addChoice("1- Obliger tous les civils à porter cette cellule en eux et désormais avoir un pouvoir");
        this.addChoice("2- Se rendre le plus fort super héros de la planète...");
    }

    @Override
    public void consequences( int choice, Economy e, Campaign campaign) {
        if(choice == 1){
            campaign.getFactions()[2].increaseApproval(30);
            campaign.getFactions()[4].increaseApproval(30);


        }
        else if (choice == 2){
            campaign.getFactions()[7].increaseApproval(40);
            campaign.getFactions()[2].increaseApproval(20);

        }

    }

    @Override
    public void consequencesEasy(int choice, Economy e, Campaign campaign) {
    	if(choice == 1){
            campaign.getFactions()[2].increaseApproval(15);
            campaign.getFactions()[4].increaseApproval(45);


        }
        else if (choice == 2){
            campaign.getFactions()[7].increaseApproval(60);
            campaign.getFactions()[2].increaseApproval(10);
        }
    }
    
    @Override
	public void consequencesHard(int choice, Economy e, Campaign campaign) {
    	if(choice == 1){
            campaign.getFactions()[2].increaseApproval(45);
            campaign.getFactions()[4].increaseApproval(15);


        }
        else if (choice == 2){
            campaign.getFactions()[7].increaseApproval(20);
            campaign.getFactions()[2].increaseApproval(35);

        }
	}
    
    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

	

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           