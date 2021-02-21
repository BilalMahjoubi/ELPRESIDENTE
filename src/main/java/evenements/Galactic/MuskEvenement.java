package evenements.Galactic;

import campagne.Campagne;
import evenements.Economie;
import evenements.Evenement;
import factions.Faction;

public class MuskEvenement extends Evenement{
    private final String description;

    public MuskEvenement() {
        super();
        this.description = "Elon Musk est votre sous-chef. Il vous convainc à investir dans la Conquête Spatial";
        this.ajouterChoix("1- Bien evidemment, la conquête spatial c'est le futur");
        this.ajouterChoix("2- Y aller doucement mais surement");
        this.ajouterChoix("3- Virez le, c'est une idée de merde, on nait sur terre, on reste sur terre;");

    }

    @Override
    public void consequences( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
            campagne.getFactions()[1].augmenterApprobation(20);
            campagne.getFactions()[7].diminuerApprobation(8);
            campagne.getFactions()[6].diminuerApprobation(8);
            campagne.getFactions()[3].diminuerApprobation(5);
            e.augmenterIndustrie(30);
        }
        else if (choix == 2){
        	campagne.getFactions()[1].augmenterApprobation(20);
        	e.augmenterIndustrie(10);
        }
        else if(choix == 3) {
            campagne.getFactions()[7].augmenterApprobation(15);
            campagne.getFactions()[6].augmenterApprobation(15);
            campagne.getFactions()[3].augmenterApprobation(5);
            campagne.getFactions()[1].diminuerApprobation(20);
        }
    }

    @Override
    public void consequencesFacile(int choix, Economie e, Campagne campagne) {
        if(choix == 1){
            campagne.getFactions()[1].diminuerApprobation(5);

        }
        else if (choix == 2){
            campagne.getFactions()[1].diminuerApprobation(20);
        }
        else if(choix == 3) {
            campagne.getFactions()[1].augmenterApprobation(20);
        }

    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           