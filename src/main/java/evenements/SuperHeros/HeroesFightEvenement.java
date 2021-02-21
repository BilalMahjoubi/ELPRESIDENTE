package evenements.SuperHeros;

import campagne.Campagne;
import economie.Economie;
import evenements.Evenement;

public class HeroesFightEvenement extends Evenement{
    private final String description;

    public HeroesFightEvenement() {
        super();
        this.description = "Les combats entre super héros et super vilains font énormément de dégâts matériaux et souvent vitaux";
        this.ajouterChoix("1- Laisser tel quel, les super héros sont plus fort que tout, on leur fait confiance");
        this.ajouterChoix("2- Créer une brigade anti-ciminelle mélangeant super-héros et humains, EGALITE pour TOUS");
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
            campagne.getFactions()[4].augmenterApprobation(30);
            campagne.getFactions()[3].diminuerApprobation(5);

        }
        else if (choix == 2){
            campagne.getFactions()[2].augmenterApprobation(20);
            campagne.getFactions()[3].diminuerApprobation(5);
            e.diminuerTrésorerie(200);
        }

    }
    
    @Override
    public void consequencesDifficile(int choix, Economie e, Campagne campagne) {
    	if(choix == 1){
            campagne.getFactions()[4].augmenterApprobation(10);
            campagne.getFactions()[3].diminuerApprobation(20);

        }
        else if (choix == 2){
            campagne.getFactions()[2].augmenterApprobation(5);
            campagne.getFactions()[3].diminuerApprobation(20);
            e.diminuerTrésorerie(700);
        }

    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           