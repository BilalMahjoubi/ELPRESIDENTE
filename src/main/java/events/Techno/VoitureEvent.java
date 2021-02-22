package events.Techno;

import campaign.Campaign;
import economy.Economy;
import events.Event;

public class VoitureEvent extends Event{
    private final String description;

    public VoitureEvent() {
        super();
        this.description = "L'industrialisation des nouvelles voitures coutent beaucoup trop cher, en plus des anciennes qui fonctionnent à essence";
        this.addChoice("1- Choisir uniquement l'industrialisation de voitures à essence");
        this.addChoice("2- Chosiri uniquement l'industrialisation de voiture électrique");
        this.addChoice("3- on en a marre des voitures, UTILISER UNIQUEMENT LES DEUX ROUES");
    }

    @Override
    public void consequences( int choice, Economy e, Campaign campaign) {
        if(choice == 1){
            e.variationIndustry(10,1);
            campaign.getFactions()[5].decreaseApproval(25);
        }
        else if (choice == 2){
            e.variationIndustry(18,1);
            campaign.getFactions()[5].decreaseApproval(15);
        }
        else if (choice == 3){
            e.variationIndustry(15,1);
            campaign.getFactions()[5].increaseApproval(15);
            campaign.getFactions()[0].decreaseApproval(10);
        }
    }

    @Override
    public void consequencesEasy(int choice, Economy e, Campaign campaign) {
    	if(choice == 1){
            e.variationIndustry(20,1);
            campaign.getFactions()[5].decreaseApproval(12);
        }
        else if (choice == 2){
            e.variationIndustry(35,1);
            campaign.getFactions()[5].decreaseApproval(7);
        }
        else if (choice == 3){
            e.variationIndustry(30,1);
            campaign.getFactions()[5].increaseApproval(30);
            campaign.getFactions()[0].decreaseApproval(5);
        }
    }
    
    public void consequencesHard( int choice, Economy e, Campaign campaign) {
        if(choice == 1){
            e.variationIndustry(5,1);
            campaign.getFactions()[5].decreaseApproval(40);
        }
        else if (choice == 2){
            e.variationIndustry(10,1);
            campaign.getFactions()[5].decreaseApproval(25);
        }
        else if (choice == 3){
            e.variationIndustry(10,1);
            campaign.getFactions()[5].increaseApproval(10);
            campaign.getFactions()[0].decreaseApproval(20);
        }
    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           