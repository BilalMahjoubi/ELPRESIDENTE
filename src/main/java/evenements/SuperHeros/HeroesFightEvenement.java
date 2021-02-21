package evenements.SuperHeros;

import campagne.Campagne;
import evenements.Economie;
import evenements.Evenement;
import factions.Faction;

public class HeroesFightEvenement extends Evenement{
    private final String description;

    public HeroesFightEvenement() {
        super();
        this.description = "Les combats entre super héros et super vilains font énormément de dégâts matériaux et souvent vitaux";
        this.ajouterChoix("1- Laisser tel quelle, les super héros sont plus fort que tout, pn leur fait confiance");
        this.ajouterChoix("3- Créer une brigade anti-ciminelle mélangeant super-héros et humains, EGALITE pour TOUS");
    }

    @Override
    public void consequences( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
            campagne.getFactions()[4].augmenterApprobation(15);
            campagne.getFactions()[3].diminuerApprobation(10);

        }
        else if (choix == 2){
            campagne.getFactions()[2].augmenterApprobation(10);
            campagne.getFactions()[3].diminuerApprobation(10);
            e.diminuerTrésorerie(450);
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           