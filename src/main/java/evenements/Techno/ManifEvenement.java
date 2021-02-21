package evenements.Techno;

import campagne.Campagne;
import evenements.Economie;
import evenements.Evenement;
import factions.Faction;

public class ManifEvenement extends Evenement{
    private final String description;

    public ManifEvenement() {
        super();
        this.description = "La nouvelle technologie a un impact beaucoup trop nuisible sur l'écologie, une manifestation ECOLO est donc organisé par beaucoup d'habitants";
        this.ajouterChoix("1- Envoyer l'armée et tuer tout manifestant");
        this.ajouterChoix("2- Laisser la manifestation se dérouler et ne rien changer aux lois");
        this.ajouterChoix("3- Se plier à leurs convictions");
    }

    @Override
    public void consequences( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
            campagne.getFactions()[4].diminuerApprobation(30);
            campagne.getFactions()[3].augmenterApprobation(10);
            campagne.getFactions()[2].diminuerApprobation(5);
        }
        else if (choix == 2){
            campagne.getFactions()[6].augmenterApprobation(10);
            campagne.getFactions()[0].augmenterApprobation(5);
            campagne.getFactions()[4].diminuerApprobation(5);
        }
        else if (choix == 3){
            campagne.getFactions()[6].diminuerApprobation(5);
            campagne.getFactions()[0].diminuerApprobation(5);
            campagne.getFactions()[4].augmenterApprobation(25);
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           