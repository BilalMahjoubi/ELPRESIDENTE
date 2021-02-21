package evenements.Techno;

import campagne.Campagne;
import evenements.Economie;
import evenements.Evenement;
import factions.Faction;

public class PuceEvenement extends Evenement{
    private final String description;

    public PuceEvenement() {
        super();
        this.description = "Certains pays commencent déjà à instaurer l'implémentation d'une puce dans la tête des habitants";
        this.ajouterChoix("1- En effet, il faut s'adapter à l'ère du temps pour pouvoir contrôler la population, tel un bon dictateur");
        this.ajouterChoix("2- Impossible !! C'est la pire idée pour diriger un pays");
    }

    @Override
    public void consequences( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
        	campagne.getFactions()[0].diminuerApprobation(8);
        	campagne.getFactions()[1].diminuerApprobation(8);
        	campagne.getFactions()[2].diminuerApprobation(12);
        	campagne.getFactions()[3].diminuerApprobation(8);
        	campagne.getFactions()[6].diminuerApprobation(8);
        	campagne.getFactions()[7].diminuerApprobation(8);
            campagne.getFactions()[5].augmenterApprobation(30);
        }
        else if (choix == 2){
        	campagne.getFactions()[0].augmenterApprobation(5);
        	campagne.getFactions()[1].augmenterApprobation(5);
        	campagne.getFactions()[2].augmenterApprobation(5);
        	campagne.getFactions()[3].augmenterApprobation(5);
        	campagne.getFactions()[6].augmenterApprobation(5);
        	campagne.getFactions()[7].augmenterApprobation(5);
            campagne.getFactions()[5].diminuerApprobation(25);
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           