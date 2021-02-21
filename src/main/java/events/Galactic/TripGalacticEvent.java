package events.Galactic;

import campaign.Campaign;
import economy.Economy;
import events.Event;

public class TripGalacticEvent extends Event{
    private final String description;

    public TripGalacticEvent() {
        super();
        this.description = "Afin de mieux connaître l'univers, investissez dans un voyage spatial qui va être organisé au profit de vos habitants ";
        this.addChoice("1- Voyager le plus proche du soleil");
        this.addChoice("2- Voyager le plus loin du soleil");
        this.addChoice("3- Prenez le risque des trous noirs");

    }

    @Override
    public void consequences( int choice, Economy e, Campaign campagne) {
        if(choice == 1){
            campagne.getFactions()[2].increaseApproval(3);
            campagne.getFactions()[3].decreaseApproval(5);
            campagne.getFactions()[0].increaseApproval(5);
        }
        else if (choice == 2){
        	campagne.getFactions()[2].increaseApproval(3);
        	campagne.getFactions()[3].decreaseApproval(5);
        	campagne.getFactions()[1].increaseApproval(5);
        }
        else if(choice == 3) {
        	campagne.getFactions()[2].increaseApproval(3);
        	campagne.getFactions()[3].decreaseApproval(5);
        	campagne.getFactions()[7].increaseApproval(5);
        }
    }

    @Override
    public void consequencesEasy(int choice, Economy e, Campaign campagne) {
    	if(choice == 1){
            campagne.getFactions()[2].increaseApproval(5);
            campagne.getFactions()[3].decreaseApproval(2);
            campagne.getFactions()[0].increaseApproval(10);
        }
        else if (choice == 2){
        	campagne.getFactions()[2].increaseApproval(5);
        	campagne.getFactions()[3].decreaseApproval(2);
        	campagne.getFactions()[1].increaseApproval(10);
        }
        else if(choice == 3) {
        	campagne.getFactions()[2].increaseApproval(5);
        	campagne.getFactions()[3].decreaseApproval(2);
        	campagne.getFactions()[7].increaseApproval(10);
        }

    }
    
	@Override
	public void consequencesHard(int choice, Economy e, Campaign campagne) {
		if(choice == 1){
            campagne.getFactions()[2].increaseApproval(2);
            campagne.getFactions()[3].decreaseApproval(10);
            campagne.getFactions()[0].increaseApproval(2);
        }
        else if (choice == 2){
        	campagne.getFactions()[2].increaseApproval(2);
        	campagne.getFactions()[3].decreaseApproval(10);
        	campagne.getFactions()[1].increaseApproval(2);
        }
        else if(choice == 3) {
        	campagne.getFactions()[2].increaseApproval(2);
        	campagne.getFactions()[3].decreaseApproval(10);
        	campagne.getFactions()[7].increaseApproval(2);
        }
	}

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }


}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           