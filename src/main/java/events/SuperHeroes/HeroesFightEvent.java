package events.SuperHeroes;

import campaign.Campaign;
import economy.Economy;
import events.Event;

public class HeroesFightEvent extends Event{
    private final String description;

    public HeroesFightEvent() {
        super();
        this.description = "Les combats entre super héros et super vilains font énormément de dégâts matériaux et souvent vitaux";
        this.addChoice("1- Laisser tel quel, les super héros sont plus fort que tout, on leur fait confiance");
        this.addChoice("2- Créer une brigade anti-ciminelle mélangeant super-héros et humains, EGALITE pour TOUS");
    }

    @Override
    public void consequences( int choice, Economy e, Campaign campaign) {
        if(choice == 1){
            campaign.getFactions()[4].increaseApproval(15);
            campaign.getFactions()[3].decreaseApproval(10);

        }
        else if (choice == 2){
            campaign.getFactions()[2].increaseApproval(10);
            campaign.getFactions()[3].decreaseApproval(10);
            e.decreaseTreasury(450);
        }
    }

    @Override
    public void consequencesEasy(int choice, Economy e, Campaign campaign) {
    	if(choice == 1){
            campaign.getFactions()[4].increaseApproval(30);
            campaign.getFactions()[3].decreaseApproval(5);

        }
        else if (choice == 2){
            campaign.getFactions()[2].increaseApproval(20);
            campaign.getFactions()[3].decreaseApproval(5);
            e.decreaseTreasury(200);
        }

    }
    
    @Override
    public void consequencesHard(int choice, Economy e, Campaign campaign) {
    	if(choice == 1){
            campaign.getFactions()[4].increaseApproval(10);
            campaign.getFactions()[3].decreaseApproval(20);

        }
        else if (choice == 2){
            campaign.getFactions()[2].increaseApproval(5);
            campaign.getFactions()[3].decreaseApproval(20);
            e.decreaseTreasury(700);
        }

    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           