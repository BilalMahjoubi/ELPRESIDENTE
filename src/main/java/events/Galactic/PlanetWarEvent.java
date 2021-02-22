package events.Galactic;

import campaign.Campaign;
import economy.Economy;
import events.Event;

public class PlanetWarEvent extends Event{
    private final String description;

    public PlanetWarEvent() {
        super();
        this.description = "Une Planète extraterrestre veut vous envahir sans se poser de questions";
        this.addChoice("1- On est pas des poules mouillés, on va contre attaquer");
        this.addChoice("2- Capituler aussi vite que possible et leur donner ce qu'ils veulent");
        this.addChoice("3- Signer un accord de paix et de vire ensemble");

    }

    @Override
    public void consequences( int choix, Economy e, Campaign campagne) {
        if(choix == 1){
            campagne.getFactions()[0].increaseApproval(5);
            campagne.getFactions()[4].increaseApproval(15);
            campagne.getFactions()[6].increaseApproval(10);
            campagne.getFactions()[2].decreaseApproval(25);
        }
        else if (choix == 2){
        	campagne.getFactions()[2].increaseApproval(18);
        	e.decreaseTreasury(15);
        	e.decreaseTreasury(10);
        }
        
        else if(choix == 3) {
            campagne.getFactions()[2].increaseApproval(15);
            campagne.getFactions()[0].decreaseApproval(5);
            campagne.getFactions()[1].decreaseApproval(5);
            campagne.getFactions()[3].decreaseApproval(5);
            campagne.getFactions()[4].decreaseApproval(5);
            campagne.getFactions()[6].decreaseApproval(5);
            campagne.getFactions()[7].decreaseApproval(5);
        }
    }

    @Override
    public void consequencesEasy(int choix, Economy e, Campaign campagne) {
    	if(choix == 1){
            campagne.getFactions()[0].increaseApproval(10);
            campagne.getFactions()[4].increaseApproval(30);
            campagne.getFactions()[6].increaseApproval(20);
            campagne.getFactions()[2].decreaseApproval(12);
        }
        else if (choix == 2){
        	campagne.getFactions()[2].increaseApproval(30);
        	e.variationAgriculture(7,0);
        	e.decreaseTreasury(5);
        }
        
        else if(choix == 3) {
            campagne.getFactions()[2].increaseApproval(30);
            campagne.getFactions()[0].decreaseApproval(2);
            campagne.getFactions()[1].decreaseApproval(2);
            campagne.getFactions()[3].decreaseApproval(2);
            campagne.getFactions()[4].decreaseApproval(2);
            campagne.getFactions()[6].decreaseApproval(2);
            campagne.getFactions()[7].decreaseApproval(2);
        }
    }
    
    public void consequencesHard(int choix, Economy e, Campaign campagne) {
    	if(choix == 1){
            campagne.getFactions()[0].increaseApproval(2);
            campagne.getFactions()[4].increaseApproval(10);
            campagne.getFactions()[6].increaseApproval(5);
            campagne.getFactions()[2].decreaseApproval(30);
        }
        else if (choix == 2){
        	campagne.getFactions()[2].increaseApproval(10);
            e.variationAgriculture(20,0);
        	e.decreaseTreasury(15);
        }
        
        else if(choix == 3) {
            campagne.getFactions()[2].increaseApproval(10);
            campagne.getFactions()[0].decreaseApproval(10);
            campagne.getFactions()[1].decreaseApproval(10);
            campagne.getFactions()[3].decreaseApproval(10);
            campagne.getFactions()[4].decreaseApproval(10);
            campagne.getFactions()[6].decreaseApproval(10);
            campagne.getFactions()[7].decreaseApproval(10);
        }
    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }
   
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           