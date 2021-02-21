package events.Techno;

import campaign.Campaign;
import economy.Economy;
import events.Event;

public class PuceEvent extends Event{
    private final String description;

    public PuceEvent() {
        super();
        this.description = "Certains pays commencent déjà à instaurer l'implémentation d'une puce dans la tête des habitants";
        this.addChoice("1- En effet, il faut s'adapter à l'ère du temps pour pouvoir contrôler la population, tel un bon dictateur");
        this.addChoice("2- Impossible !! C'est la pire idée pour diriger un pays");
    }

    @Override
    public void consequences( int choice, Economy e, Campaign campaign) {
        if(choice == 1){
        	campaign.getFactions()[0].decreaseApproval(8);
        	campaign.getFactions()[1].decreaseApproval(8);
        	campaign.getFactions()[2].decreaseApproval(12);
        	campaign.getFactions()[3].decreaseApproval(8);
        	campaign.getFactions()[6].decreaseApproval(8);
        	campaign.getFactions()[7].decreaseApproval(8);
            campaign.getFactions()[5].increaseApproval(30);
        }
        else if (choice == 2){
        	campaign.getFactions()[0].increaseApproval(5);
        	campaign.getFactions()[1].increaseApproval(5);
        	campaign.getFactions()[2].increaseApproval(5);
        	campaign.getFactions()[3].increaseApproval(5);
        	campaign.getFactions()[6].increaseApproval(5);
        	campaign.getFactions()[7].increaseApproval(5);
            campaign.getFactions()[5].decreaseApproval(25);
        }
    }

    @Override
    public void consequencesEasy(int choice, Economy e, Campaign campaign) {
    	if(choice == 1){
        	campaign.getFactions()[0].decreaseApproval(4);
        	campaign.getFactions()[1].decreaseApproval(4);
        	campaign.getFactions()[2].decreaseApproval(6);
        	campaign.getFactions()[3].decreaseApproval(4);
        	campaign.getFactions()[6].decreaseApproval(4);
        	campaign.getFactions()[7].decreaseApproval(4);
            campaign.getFactions()[5].increaseApproval(60);
        }
        else if (choice == 2){
        	campaign.getFactions()[0].increaseApproval(10);
        	campaign.getFactions()[1].increaseApproval(10);
        	campaign.getFactions()[2].increaseApproval(10);
        	campaign.getFactions()[3].increaseApproval(10);
        	campaign.getFactions()[6].increaseApproval(10);
        	campaign.getFactions()[7].increaseApproval(10);
            campaign.getFactions()[5].decreaseApproval(15);
        }

    }
    
    public void consequencesHard( int choice, Economy e, Campaign campaign) {
        if(choice == 1){
        	campaign.getFactions()[0].decreaseApproval(15);
        	campaign.getFactions()[1].decreaseApproval(15);
        	campaign.getFactions()[2].decreaseApproval(20);
        	campaign.getFactions()[3].decreaseApproval(15);
        	campaign.getFactions()[6].decreaseApproval(15);
        	campaign.getFactions()[7].decreaseApproval(815);
            campaign.getFactions()[5].increaseApproval(20);
        }
        else if (choice == 2){
        	campaign.getFactions()[0].increaseApproval(3);
        	campaign.getFactions()[1].increaseApproval(3);
        	campaign.getFactions()[2].increaseApproval(3);
        	campaign.getFactions()[3].increaseApproval(3);
        	campaign.getFactions()[6].increaseApproval(3);
        	campaign.getFactions()[7].increaseApproval(3);
            campaign.getFactions()[5].decreaseApproval(40);
        }
    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           