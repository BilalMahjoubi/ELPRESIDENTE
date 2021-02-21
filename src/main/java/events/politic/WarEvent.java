package events.politic;

import campaign.Campaign;
import economy.Economy;
import events.Event;

public class WarEvent extends Event {

    private String description;

    public WarEvent() {
        super();
        this.description = "La Russie veut vous déclarer la guerre.";
        this.addChoice("1- A la guerre ! Ils vont voir ces buveurs de vodka !");
        this.addChoice("2- Attendez on peut négocier non ? ");


    }

    @Override
    public void consequences(int choice, Economy e, Campaign campaign) {
        if(choice == 1){
            campaign.getFactions()[1].decreaseApproval(30);
        } else if (choice == 2) {
        	campaign.getFactions()[3].decreaseApproval(30);
        }

    }

    @Override
    public void consequencesEasy(int choice, Economy e, Campaign campaign) {
    	if(choice == 1){
            campaign.getFactions()[2].decreaseApproval(15);
        } else if (choice == 2) {
        	campaign.getFactions()[4].decreaseApproval(15);
        }
    }

    @Override
    public void consequencesHard(int choice, Economy e, Campaign campaign) {
    	if(choice == 1){
            campaign.getFactions()[0].decreaseApproval(45);
        } else if (choice == 2) {
        	campaign.getFactions()[6].decreaseApproval(45);
        }
    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }
}
