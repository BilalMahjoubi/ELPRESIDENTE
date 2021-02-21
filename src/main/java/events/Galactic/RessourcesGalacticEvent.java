package events.Galactic;

import campaign.Campaign;
import economy.Economy;
import events.Event;

public class RessourcesGalacticEvent extends Event{
    private final String description;

    public RessourcesGalacticEvent() {
        super();
        this.description = "Plusieurs ressources universelles peuvent être très bénéfiques pour l'industrie du pays, mais coutent TRES chers";
        this.addChoice("1- Exploiter la lumière des étoiles");
        this.addChoice("2- Exploiter le gaz de l'univers");
        this.addChoice("3- Exploiter les débris des météorites");

    }

    @Override
    public void consequences( int choice, Economy e, Campaign campaign) {
        if(choice == 1){
            e.increaseIndustry(15);
            e.decreaseTreasury(50000);
        }
        else if (choice == 2){
        	e.increaseIndustry(10);
            e.decreaseTreasury(5000);
        }
        else if(choice == 3) {
        	e.increaseIndustry(5);
            e.decreaseTreasury(500);
        }
    }

    @Override
    public void consequencesEasy(int choice, Economy e, Campaign campaign) {
    	if(choice == 1){
            e.increaseIndustry(30);
            e.decreaseTreasury(5000);
        }
        else if (choice == 2){
        	e.increaseIndustry(20);
            e.decreaseTreasury(500);
        }
        else if(choice == 3) {
        	e.increaseIndustry(10);
            e.decreaseTreasury(50);
        }

    }
    
    @Override
	public void consequencesHard(int choice, Economy e, Campaign campaign) {
    	if(choice == 1){
            e.increaseIndustry(10);
            e.decreaseTreasury(70000);
        }
        else if (choice == 2){
        	e.increaseIndustry(5);
            e.decreaseTreasury(7000);
        }
        else if(choice == 3) {
        	e.increaseIndustry(2);
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           