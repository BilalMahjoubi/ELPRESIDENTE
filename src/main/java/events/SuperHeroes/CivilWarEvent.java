package events.SuperHeroes;

import campaign.Campaign;
import economy.Economy;
import events.Event;

public class CivilWarEvent extends Event{
    private final String description;

    public CivilWarEvent() {
        super();
        this.description = "Le racisme anti super-héros est de plus en plus fréquent. Aujourd'hui, les super héros se mettent en colère et décident d'attaquer les humains provocant une guerre civil dans le pays";
        this.addChoice("1- Supporter les super héros");
        this.addChoice("2- Supporter les humains");
        this.addChoice("3- Trouver un compromis pour leur liberté");
    }

    @Override
    public void consequences( int choix, Economy e, Campaign campaign) {
        if(choix == 1){
            campaign.getFactions()[4].increaseApproval(30);
            campaign.getFactions()[3].decreaseApproval(20);
        }
        else if (choix == 2){
            campaign.getFactions()[3].increaseApproval(20);
            campaign.getFactions()[4].decreaseApproval(20);


        }
        else if (choix == 3){
            campaign.getFactions()[2].increaseApproval(10);
            campaign.getFactions()[4].decreaseApproval(20);
            campaign.getFactions()[3].decreaseApproval(20);

        }
    }

    @Override
    public void consequencesEasy(int choix, Economy e, Campaign campaign) {
    	if(choix == 1){
            campaign.getFactions()[4].increaseApproval(45);
            campaign.getFactions()[3].decreaseApproval(10);
        }
        else if (choix == 2){
            campaign.getFactions()[3].increaseApproval(40);
            campaign.getFactions()[4].decreaseApproval(10);


        }
        else if (choix == 3){
            campaign.getFactions()[2].increaseApproval(20);
            campaign.getFactions()[4].decreaseApproval(10);
            campaign.getFactions()[3].decreaseApproval(10);

        }

    }
    
    @Override
    public void consequencesHard(int choix, Economy e, Campaign campaign) {
    	if(choix == 1){
            campaign.getFactions()[4].increaseApproval(15);
            campaign.getFactions()[3].decreaseApproval(30);
        }
        else if (choix == 2){
            campaign.getFactions()[3].increaseApproval(10);
            campaign.getFactions()[4].decreaseApproval(30);


        }
        else if (choix == 3){
            campaign.getFactions()[2].increaseApproval(5);
            campaign.getFactions()[4].decreaseApproval(30);
            campaign.getFactions()[3].decreaseApproval(30);

        }

    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           