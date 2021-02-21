package evenements.SuperHeros;

import campagne.Campagne;
import evenements.Economie;
import evenements.Evenement;
import factions.Faction;

public class CivilWarEvenement extends Evenement{
    private final String description;

    public CivilWarEvenement() {
        super();
        this.description = "Le racisme anti super-héros est de plus en plus fréquent. Aujourd'hui, les super héros se mettent en colère et décident d'attaquer les humains provocant une guerre civil dans le pays";
        this.ajouterChoix("1- Supporter les super héros");
        this.ajouterChoix("2- Supporter les humains");
        this.ajouterChoix("3- Trouver un compromis pour leur liberté");
    }

    @Override
    public void consequences( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
            campagne.getFactions()[4].augmenterApprobation(30);
            campagne.getFactions()[3].diminuerApprobation(20);
        }
        else if (choix == 2){
            campagne.getFactions()[3].augmenterApprobation(20);
            campagne.getFactions()[4].diminuerApprobation(20);


        }
        else if (choix == 3){
            campagne.getFactions()[2].augmenterApprobation(10);
            campagne.getFactions()[4].diminuerApprobation(20);
            campagne.getFactions()[3].diminuerApprobation(20);

        }
    }

    @Override
    public void consequencesFacile(int choix, Economie e, Campagne campagne) {
    	if(choix == 1){
            campagne.getFactions()[4].augmenterApprobation(45);
            campagne.getFactions()[3].diminuerApprobation(10);
        }
        else if (choix == 2){
            campagne.getFactions()[3].augmenterApprobation(40);
            campagne.getFactions()[4].diminuerApprobation(10);


        }
        else if (choix == 3){
            campagne.getFactions()[2].augmenterApprobation(20);
            campagne.getFactions()[4].diminuerApprobation(10);
            campagne.getFactions()[3].diminuerApprobation(10);

        }

    }
    
    @Override
    public void consequencesDifficile(int choix, Economie e, Campagne campagne) {
    	if(choix == 1){
            campagne.getFactions()[4].augmenterApprobation(15);
            campagne.getFactions()[3].diminuerApprobation(30);
        }
        else if (choix == 2){
            campagne.getFactions()[3].augmenterApprobation(10);
            campagne.getFactions()[4].diminuerApprobation(30);


        }
        else if (choix == 3){
            campagne.getFactions()[2].augmenterApprobation(5);
            campagne.getFactions()[4].diminuerApprobation(30);
            campagne.getFactions()[3].diminuerApprobation(30);

        }

    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           