package events;

import campaign.Campaign;
import economy.Economy;

public class EventYearEnd extends Event {
    private final String description;

    public EventYearEnd() {
        this.description = "C'est la fin d'année ! Il est temps de faire le bilan.";
        this.addChoice("1- Acceder au marche alimentaire");
        this.addChoice("2- Faire un pot de vin");

    }


    @Override
    public void consequences(int choice, Economy e, Campaign campaign) {
        if (choice == 1) {
            e.marketFood();

        } else if (choice == 2) {
            e.potDeVin(campaign);
        }

    }

    @Override
    public void consequencesEasy(int choice, Economy e, Campaign campaign) {

    }
    
    @Override
	public void consequencesHard(int choice, Economy e, Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

    @Override
    public String getDescription() {
        String s = "";
        System.out.println(description);
        return s;
    }
	

}