package evenements;

import campagne.Campagne;
import factions.Faction;

public class GuerreEvenement extends Evenement{

    private String description;

    public GuerreEvenement() {
        super();
        this.description = "La Russie veut vous déclarer la guerre.";
        this.ajouterChoix("1-A la guerre ! Ils vont voir ces buveurs de vodka !  (-60 d'approbation des communistes)");
        this.ajouterChoix("2-Attendez on peut négocier non ? ");


    }

    @Override
    public void consequences( int choix, Economie economie, Campagne campagne) {
        if(choix == 1){
            campagne.getFactions()[1].diminuerApprobation(60);
        }

    }

    @Override
    public void consequencesFacile(int choix, Economie e, Campagne campagne) {

    }

    @Override
    public void consequencesDifficile(int choix, Economie e, Campagne campagne) {

    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }
}
