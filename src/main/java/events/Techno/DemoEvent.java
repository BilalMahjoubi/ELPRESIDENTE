package events.Techno;

import campaign.Campaign;
import economy.Economy;
import events.Event;

public class DemoEvent extends Event{
    private final String description;

    public DemoEvent() {
        super();
        this.description = "La nouvelle technologie a un impact beaucoup trop nuisible sur l'écologie, une manifestation ECOLO est donc organisé par beaucoup d'habitants";
        this.addChoice("1- Envoyer l'armée et tuer tout manifestant");
        this.addChoice("2- Laisser la manifestation se dérouler et ne rien changer aux lois");
        this.addChoice("3- Se plier à leurs convictions");
    }

    @Override
    public void consequences( int choice, Economy e, Campaign campaign) {
        if(choice == 1){
            campaign.getFactions()[4].decreaseApproval(30);
            campaign.getFactions()[3].increaseApproval(10);
            campaign.getFactions()[2].decreaseApproval(5);
        }
        else if (choice == 2){
            campaign.getFactions()[6].increaseApproval(10);
            campaign.getFactions()[0].increaseApproval(5);
            campaign.getFactions()[4].decreaseApproval(5);
        }
        else if (choice == 3){
            campaign.getFactions()[6].decreaseApproval(5);
            campaign.getFactions()[0].decreaseApproval(5);
            campaign.getFactions()[4].increaseApproval(25);
        }
        
    }

    @Override
    public void consequencesEasy(int choice, Economy e, Campaign campaign) {
    	if(choice == 1){
            campaign.getFactions()[4].decreaseApproval(15);
            campaign.getFactions()[3].increaseApproval(20);
            campaign.getFactions()[2].decreaseApproval(2);
        }
        else if (choice == 2){
            campaign.getFactions()[6].increaseApproval(20);
            campaign.getFactions()[0].increaseApproval(10);
            campaign.getFactions()[4].decreaseApproval(2);
        }
        else if (choice == 3){
            campaign.getFactions()[6].decreaseApproval(2);
            campaign.getFactions()[0].decreaseApproval(2);
            campaign.getFactions()[4].increaseApproval(50);
        }

    }
    
    public void consequencesHard( int choice, Economy e, Campaign campaign) {
        if(choice == 1){
            campaign.getFactions()[4].decreaseApproval(50);
            campaign.getFactions()[3].increaseApproval(5);
            campaign.getFactions()[2].decreaseApproval(10);
        }
        else if (choice == 2){
            campaign.getFactions()[6].increaseApproval(5);
            campaign.getFactions()[0].increaseApproval(10);
            campaign.getFactions()[4].decreaseApproval(10);
        }
        else if (choice == 3){
            campaign.getFactions()[6].decreaseApproval(10);
            campaign.getFactions()[0].decreaseApproval(10);
            campaign.getFactions()[4].increaseApproval(15);
        }
        
    }
    
    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           