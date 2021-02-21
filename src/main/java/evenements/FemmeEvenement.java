package evenements;

import campagne.Campagne;
import factions.Faction;

public class FemmeEvenement extends Evenement{
    private final String description;

    public FemmeEvenement() {
        super();
        this.description = "La femme du chef du parti communiste vous fait des avances.";
        this.ajouterChoix("1-Que vous êtes jolie ! (prendre son temps) ");
        this.ajouterChoix("2-Vous voulez voir ma collection de timbre ? (accepter) ");
        this.ajouterChoix("3-Certes vous partagez vos biens mais certainement pas les femme ! ");

    }

    @Override
    public void consequences( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
            campagne.getFactions()[1].diminuerApprobation(5);

        }
        else if (choix == 2){
            campagne.getFactions()[1].diminuerApprobation(60);
        }
        else if(choix == 3) {
            campagne.getFactions()[1].augmenterApprobation(12);
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
    public void consequencesDifficile(int choix, Economie e, Campagne campagne) {

    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           