package evenements.Galactic;

import campagne.Campagne;
import economie.Economie;
import evenements.Evenement;

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
            e.augmenterIndustrie(30);
            e.diminuerTrésorerie(5000);
        }
        else if (choix == 2){
        	e.augmenterIndustrie(20);
            e.diminuerTrésorerie(500);
        }
        else if(choix == 3) {
        	e.augmenterIndustrie(10);
            e.diminuerTrésorerie(50);
        }

    }
    
    @Override
	public void consequencesDifficile(int choix, Economie e, Campagne campagne) {
    	if(choix == 1){
            e.augmenterIndustrie(10);
            e.diminuerTrésorerie(70000);
        }
        else if (choix == 2){
        	e.augmenterIndustrie(5);
            e.diminuerTrésorerie(7000);
        }
        else if(choix == 3) {
        	e.augmenterIndustrie(2);
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
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           