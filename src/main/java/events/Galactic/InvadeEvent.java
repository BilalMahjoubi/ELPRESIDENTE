package events.Galactic;

import campaign.Campaign;
import economy.Economy;
import events.Event;

public class InvadeEvent extends Event{
    private final String description;

    public InvadeEvent() {
        super();
        this.description = "Une méteroite a explosé sur le territoire laissant derrière la création d'une nouvelle espèce animale extraterrestre";
        this.addChoice("1- L'éradiquer sans se poser de question");
        this.addChoice("2- En faire des animaux domestiques");
        this.addChoice("3- Les utiliser en tant qu'aliment pour la cuisine (attention aux maladies...)");

    }

    @Override
    public void consequences( int choice, Economy e, Campaign campaign) {
        if(choice == 1){
        	campaign.getFactions()[3].decreaseApproval(10);
            campaign.getFactions()[4].decreaseApproval(5);
            campaign.getFactions()[5].decreaseApproval(20);
            campaign.getFactions()[6].increaseApproval(10);
        }
        else if (choice == 2){
            campaign.getFactions()[2].increaseApproval(15);
            campaign.getFactions()[7].decreaseApproval(5);
        }
        else if(choice == 3) {
        	e.variationAgriculture(10,1);
            e.variationIndustry(5,1);
        }
    }

    @Override
    public void consequencesEasy(int choice, Economy e, Campaign campaign) {
    	if(choice == 1){
        	campaign.getFactions()[3].decreaseApproval(5);
            campaign.getFactions()[5].decreaseApproval(10);
            campaign.getFactions()[6].increaseApproval(20);
        }
        else if (choice == 2){
            campaign.getFactions()[2].increaseApproval(30);
        }
        else if(choice == 3) {
        	e.variationAgriculture(20,1);
            e.variationIndustry(10,1);
        }

    }
    
    public void consequencesHard(int choice, Economy e, Campaign campaign) {
    	if(choice == 1){
        	campaign.getFactions()[3].decreaseApproval(15);
            campaign.getFactions()[4].decreaseApproval(10);
            campaign.getFactions()[5].decreaseApproval(25);
            campaign.getFactions()[6].increaseApproval(5);
        }
        else if (choice == 2){
            campaign.getFactions()[2].increaseApproval(5);
            campaign.getFactions()[7].decreaseApproval(10);
        }
        else if(choice == 3) {
        	e.variationAgriculture(5,1);
            e.variationAgriculture(5,1);
        }
    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           