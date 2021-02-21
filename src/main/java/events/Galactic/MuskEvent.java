package events.Galactic;

import campaign.Campaign;
import economy.Economy;
import events.Event;

public class MuskEvent extends Event{
    private final String description;

    public MuskEvent() {
        super();
        this.description = "Elon Musk est votre sous-chef. Il vous convainc à investir dans la Conquête Spatial";
        this.addChoice("1- Bien evidemment, la conquête spatial c'est le futur");
        this.addChoice("2- Y aller doucement mais surement");
        this.addChoice("3- Virez le, c'est une idée de merde, on nait sur terre, on reste sur terre;");

    }

    @Override
    public void consequences( int choice, Economy e, Campaign campaign) {
        if(choice == 1){
            campaign.getFactions()[1].increaseApproval(20);
            campaign.getFactions()[7].decreaseApproval(8);
            campaign.getFactions()[6].decreaseApproval(8);
            campaign.getFactions()[3].decreaseApproval(5);
            e.increaseIndustry(30);
        }
        else if (choice == 2){
        	campaign.getFactions()[1].increaseApproval(20);
        	e.increaseIndustry(10);
        }
        else if(choice == 3) {
            campaign.getFactions()[7].increaseApproval(15);
            campaign.getFactions()[6].increaseApproval(15);
            campaign.getFactions()[3].increaseApproval(5);
            campaign.getFactions()[1].decreaseApproval(20);
        }
    }

    @Override
    public void consequencesEasy( int choice, Economy e, Campaign campaign) {
        if(choice == 1){
            campaign.getFactions()[1].increaseApproval(40);
            campaign.getFactions()[7].decreaseApproval(4);
            campaign.getFactions()[6].decreaseApproval(4);
            campaign.getFactions()[3].decreaseApproval(2);
            e.increaseIndustry(30);
        }
        else if (choice == 2){
        	campaign.getFactions()[1].increaseApproval(40);
        	e.increaseIndustry(20);
        }
        else if(choice == 3) {
            campaign.getFactions()[7].increaseApproval(30);
            campaign.getFactions()[6].increaseApproval(30);
            campaign.getFactions()[3].increaseApproval(10);
            campaign.getFactions()[1].decreaseApproval(10);
        }
    }
    
    public void consequencesHard( int choice, Economy e, Campaign campaign) {
        if(choice == 1){
            campaign.getFactions()[1].increaseApproval(10);
            campaign.getFactions()[7].decreaseApproval(15);
            campaign.getFactions()[6].decreaseApproval(15);
            campaign.getFactions()[3].decreaseApproval(10);
            e.increaseIndustry(30);
        }
        else if (choice == 2){
        	campaign.getFactions()[1].increaseApproval(10);
        	e.increaseIndustry(10);
        }
        else if(choice == 3) {
            campaign.getFactions()[7].increaseApproval(10);
            campaign.getFactions()[6].increaseApproval(10);
            campaign.getFactions()[3].increaseApproval(2);
            campaign.getFactions()[1].decreaseApproval(30);
        }
    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           