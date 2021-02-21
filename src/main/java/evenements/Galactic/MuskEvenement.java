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
    public void consequencesFacile( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
            campagne.getFactions()[1].augmenterApprobation(40);
            campagne.getFactions()[7].diminuerApprobation(4);
            campagne.getFactions()[6].diminuerApprobation(4);
            campagne.getFactions()[3].diminuerApprobation(2);
            e.augmenterIndustrie(30);
        }
        else if (choix == 2){
        	campagne.getFactions()[1].augmenterApprobation(40);
        	e.augmenterIndustrie(20);
        }
        else if(choix == 3) {
            campagne.getFactions()[7].augmenterApprobation(30);
            campagne.getFactions()[6].augmenterApprobation(30);
            campagne.getFactions()[3].augmenterApprobation(10);
            campagne.getFactions()[1].diminuerApprobation(10);
        }
    }
    
    public void consequencesDifficile( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
            campagne.getFactions()[1].augmenterApprobation(10);
            campagne.getFactions()[7].diminuerApprobation(15);
            campagne.getFactions()[6].diminuerApprobation(15);
            campagne.getFactions()[3].diminuerApprobation(10);
            e.augmenterIndustrie(30);
        }
        else if (choix == 2){
        	campagne.getFactions()[1].augmenterApprobation(10);
        	e.augmenterIndustrie(10);
        }
        else if(choix == 3) {
            campagne.getFactions()[7].augmenterApprobation(10);
            campagne.getFactions()[6].augmenterApprobation(10);
            campagne.getFactions()[3].augmenterApprobation(2);
            campagne.getFactions()[1].diminuerApprobation(30);
        }
    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           