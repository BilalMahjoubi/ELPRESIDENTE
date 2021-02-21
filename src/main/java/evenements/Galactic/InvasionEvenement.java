package evenements.Galactic;

import campagne.Campagne;
import evenements.Economie;
import evenements.Evenement;
import factions.Faction;

public class InvasionEvenement extends Evenement{
    private final String description;

    public InvasionEvenement() {
        super();
        this.description = "Une méteroite a explosé sur le territoire laissant derrière la création d'une nouvelle espèce animale extraterrestre";
        this.ajouterChoix("1- L'éradiquer sans se poser de question");
        this.ajouterChoix("2- En faire des animaux domestiques");
        this.ajouterChoix("3- Les utiliser en tant qu'aliment pour la cuisine (attention aux maladies...)");

    }

    @Override
    public void consequences( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
        	campagne.getFactions()[3].diminuerApprobation(10);
            campagne.getFactions()[4].diminuerApprobation(5);
            campagne.getFactions()[5].diminuerApprobation(20);
            campagne.getFactions()[6].augmenterApprobation(10);
        }
        else if (choix == 2){
            campagne.getFactions()[2].augmenterApprobation(15);
            campagne.getFactions()[7].diminuerApprobation(5);
        }
        else if(choix == 3) {
        	e.augmenterAgriculture(10);
            e.augmenterIndustrie(5);
        }
    }

    @Override
    public void consequencesFacile(int choix, Economie e, Campagne campagne) {
    	if(choix == 1){
        	campagne.getFactions()[3].diminuerApprobation(5);
            campagne.getFactions()[5].diminuerApprobation(10);
            campagne.getFactions()[6].augmenterApprobation(20);
        }
        else if (choix == 2){
            campagne.getFactions()[2].augmenterApprobation(30);
        }
        else if(choix == 3) {
        	e.augmenterAgriculture(20);
            e.augmenterIndustrie(10);
        }

    }
    
    public void consequencesDifficile(int choix, Economie e, Campagne campagne) {
    	if(choix == 1){
        	campagne.getFactions()[3].diminuerApprobation(15);
            campagne.getFactions()[4].diminuerApprobation(10);
            campagne.getFactions()[5].diminuerApprobation(25);
            campagne.getFactions()[6].augmenterApprobation(5);
        }
        else if (choix == 2){
            campagne.getFactions()[2].augmenterApprobation(5);
            campagne.getFactions()[7].diminuerApprobation(10);
        }
        else if(choix == 3) {
        	e.augmenterAgriculture(5);
            e.augmenterIndustrie(5);
        }
    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           