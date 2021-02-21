package evenements.Galactic;

import campagne.Campagne;
import evenements.Economie;
import evenements.Evenement;
import factions.Faction;

public class RessourcesGalacticEvenement extends Evenement{
    private final String description;

    public RessourcesGalacticEvenement() {
        super();
        this.description = "Plusieurs ressources universelles peuvent être très bénéfiques pour l'industrie du pays, mais coutent TRES chers";
        this.ajouterChoix("1- Exploiter la lumière des étoiles");
        this.ajouterChoix("2- Exploiter le gaz de l'univers");
        this.ajouterChoix("3- Exploiter les débris des météorites");

    }

    @Override
    public void consequences( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
            e.augmenterIndustrie(15);
            e.diminuerTrésorerie(50000);
        }
        else if (choix == 2){
        	e.augmenterIndustrie(10);
            e.diminuerTrésorerie(5000);
        }
        else if(choix == 3) {
        	e.augmenterIndustrie(5);
            e.diminuerTrésorerie(500);
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           