package events.politic;

import campaign.Campaign;
import economy.Economy;
import events.Event;

public class WomanEvent extends Event {
    private final String description;

    public WomanEvent() {
        super();
        this.description = "La femme du chef du parti communiste vous fait des avances.";
        this.addChoice("1-Que vous êtes jolie ! (prendre son temps) ");
        this.addChoice("2-Vous voulez voir ma collection de timbre ? (accepter) ");
        this.addChoice("3-Certes vous partagez vos biens mais certainement pas les femme ! ");

    }

    @Override
    public void consequences(int choix, Economy e, Campaign campagne) {
        if(choix == 1){
            campagne.getFactions()[1].decreaseApproval(10);

        }
        else if (choix == 2){
            campagne.getFactions()[3].decreaseApproval(30);
        }
        else if(choix == 3) {
            campagne.getFactions()[7].increaseApproval(12);
        }
    }

    @Override
    public void consequencesEasy(int choix, Economy e, Campaign campagne) {
        if(choix == 1){
            campagne.getFactions()[2].decreaseApproval(5);

        }
        else if (choix == 2){
            campagne.getFactions()[3].decreaseApproval(10);
        }
        else if(choix == 3) {
            campagne.getFactions()[6].increaseApproval(20);
        }

    }

    @Override
    public void consequencesHard(int choix, Economy e, Campaign campagne) {
    	if(choix == 1){
            campagne.getFactions()[1].decreaseApproval(20);

        }
        else if (choix == 2){
            campagne.getFactions()[3].decreaseApproval(40);
        }
        else if(choix == 3) {
            campagne.getFactions()[7].increaseApproval(7);
        }
    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           