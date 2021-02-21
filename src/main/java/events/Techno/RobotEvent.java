package events.Techno;

import campaign.Campaign;
import economy.Economy;
import events.Event;

public class RobotEvent extends Event{
    private final String description;

    public RobotEvent() {
        super();
        this.description = "L'Intelligence Artificielle se rebelle face à ses créateurs et veut tout anéantir.";
        this.addChoice("1- Se laisser abattre et se soumettre aux robots pendant un une saison");
        this.addChoice("2- Prendre les armes pour contre attaquer");
        this.addChoice("3- Payer le hacker le plus experimenté pour arrêter cette attaque (il est très égoiste attend qu'on le paye extrêmement cher...)");
    }

    @Override
    public void consequences( int choice, Economy e, Campaign campaign) {
        if(choice == 1){
            campaign.getFactions()[0].decreaseApproval(7);
            campaign.getFactions()[1].decreaseApproval(7);
            campaign.getFactions()[2].decreaseApproval(7);
            campaign.getFactions()[3].decreaseApproval(7);
            campaign.getFactions()[4].increaseApproval(10);
            campaign.getFactions()[7].increaseApproval(10);
        }
        else if (choice == 2){
        	campaign.getFactions()[4].increaseApproval(15);
        	campaign.getFactions()[6].decreaseApproval(7);
        	campaign.getFactions()[2].decreaseApproval(10);
        }
        else if (choice == 3){
        	campaign.getFactions()[0].increaseApproval(15);
        	campaign.getFactions()[1].decreaseApproval(10);
        }
    }

    @Override
    public void consequencesEasy(int choice, Economy e, Campaign campaign) {
    	if(choice == 1){
            campaign.getFactions()[0].decreaseApproval(5);
            campaign.getFactions()[1].decreaseApproval(5);
            campaign.getFactions()[2].decreaseApproval(5);
            campaign.getFactions()[3].decreaseApproval(5);
            campaign.getFactions()[4].increaseApproval(20);
            campaign.getFactions()[7].increaseApproval(20);
        }
        else if (choice == 2){
        	campaign.getFactions()[4].increaseApproval(30);
        	campaign.getFactions()[6].decreaseApproval(5);
        	campaign.getFactions()[2].decreaseApproval(5);
        }
        else if (choice == 3){
        	campaign.getFactions()[0].increaseApproval(30);
        	campaign.getFactions()[1].decreaseApproval(5);
        }

    }
    
    public void consequencesHard( int choice, Economy e, Campaign campaign) {
        if(choice == 1){
            campaign.getFactions()[0].decreaseApproval(10);
            campaign.getFactions()[1].decreaseApproval(10);
            campaign.getFactions()[2].decreaseApproval(10);
            campaign.getFactions()[3].decreaseApproval(10);
            campaign.getFactions()[4].increaseApproval(5);
            campaign.getFactions()[7].increaseApproval(5);
        }
        else if (choice == 2){
        	campaign.getFactions()[4].increaseApproval(7);
        	campaign.getFactions()[6].decreaseApproval(10);
        	campaign.getFactions()[2].decreaseApproval(15);
        }
        else if (choice == 3){
        	campaign.getFactions()[0].increaseApproval(10);
        	campaign.getFactions()[1].decreaseApproval(20);
        }
    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           