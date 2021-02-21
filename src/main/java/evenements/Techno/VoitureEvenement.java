package evenements.Techno;

import campagne.Campagne;
import evenements.Economie;
import evenements.Evenement;
import factions.Faction;

public class VoitureEvenement extends Evenement{
    private final String description;

    public VoitureEvenement() {
        super();
        this.description = "L'industrialisation des nouvelles voitures coutent beaucoup trop cher, en plus des anciennes qui fonctionnent à essence";
        this.ajouterChoix("1- Choisir uniquement l'industrialisation de voitures à essence");
        this.ajouterChoix("2- Chosiri uniquement l'industrialisation de voiture électrique");
        this.ajouterChoix("3- on en a marre des voitures, UTILISER UNIQUEMENT LES DEUX ROUES");
    }

    @Override
    public void consequences( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
            e.augmenterIndustrie(10);
            campagne.getFactions()[5].diminuerApprobation(25);
        }
        else if (choix == 2){
        	e.augmenterIndustrie(18);
            campagne.getFactions()[5].diminuerApprobation(15);
        }
        else if (choix == 3){
        	e.augmenterIndustrie(15);
            campagne.getFactions()[5].augmenterApprobation(15);
            campagne.getFactions()[0].diminuerApprobation(10);
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           