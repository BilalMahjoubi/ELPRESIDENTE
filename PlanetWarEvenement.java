package evenements.Galactic;

import campagne.Campagne;
import evenements.Economie;
import evenements.Evenement;
import factions.Faction;

public class PlanetWarEvenement extends Evenement{
    private final String description;

    public PlanetWarEvenement() {
        super();
        this.description = "Une Planète extraterrestre veut vous envahir sans se poser de questions";
        this.ajouterChoix("1- On est pas des poules mouillés, on va contre attaquer");
        this.ajouterChoix("2- Capituler aussi vite que possible et leur donner ce qu'ils veulent");
        this.ajouterChoix("3- Signer un accord de paix et de vire ensemble");

    }

    @Override
    public void consequences( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
            campagne.getFactions()[0].augmenterApprobation(5);
            campagne.getFactions()[4].augmenterApprobation(15);
            campagne.getFactions()[6].augmenterApprobation(10);
            campagne.getFactions()[2].diminuerApprobation(25);
        }
        else if (choix == 2){
        	campagne.getFactions()[2].augmenterApprobation(18);
        	e.diminuerAgriculture(15);
        	e.diminuerTrésorerie(10);
        }
        
        else if(choix == 3) {
            campagne.getFactions()[2].augmenterApprobation(15);
            campagne.getFactions()[0].diminuerApprobation(5);
            campagne.getFactions()[1].diminuerApprobation(5);
            campagne.getFactions()[3].diminuerApprobation(5);
            campagne.getFactions()[4].diminuerApprobation(5);
            campagne.getFactions()[6].diminuerApprobation(5);
            campagne.getFactions()[7].diminuerApprobation(5);
        }
    }

    @Override
    public void consequencesFacile(int choix, Economie e, Campagne campagne) {
    	if(choix == 1){
            campagne.getFactions()[0].augmenterApprobation(10);
            campagne.getFactions()[4].augmenterApprobation(30);
            campagne.getFactions()[6].augmenterApprobation(20);
            campagne.getFactions()[2].diminuerApprobation(12);
        }
        else if (choix == 2){
        	campagne.getFactions()[2].augmenterApprobation(30);
        	e.diminuerAgriculture(7);
        	e.diminuerTrésorerie(5);
        }
        
        else if(choix == 3) {
            campagne.getFactions()[2].augmenterApprobation(30);
            campagne.getFactions()[0].diminuerApprobation(2);
            campagne.getFactions()[1].diminuerApprobation(2);
            campagne.getFactions()[3].diminuerApprobation(2);
            campagne.getFactions()[4].diminuerApprobation(2);
            campagne.getFactions()[6].diminuerApprobation(2);
            campagne.getFactions()[7].diminuerApprobation(2);
        }
    }
    
    public void consequencesDifficile(int choix, Economie e, Campagne campagne) {
    	if(choix == 1){
            campagne.getFactions()[0].augmenterApprobation(2);
            campagne.getFactions()[4].augmenterApprobation(10);
            campagne.getFactions()[6].augmenterApprobation(5);
            campagne.getFactions()[2].diminuerApprobation(30);
        }
        else if (choix == 2){
        	campagne.getFactions()[2].augmenterApprobation(10);
        	e.diminuerAgriculture(20);
        	e.diminuerTrésorerie(15);
        }
        
        else if(choix == 3) {
            campagne.getFactions()[2].augmenterApprobation(10);
            campagne.getFactions()[0].diminuerApprobation(10);
            campagne.getFactions()[1].diminuerApprobation(10);
            campagne.getFactions()[3].diminuerApprobation(10);
            campagne.getFactions()[4].diminuerApprobation(10);
            campagne.getFactions()[6].diminuerApprobation(10);
            campagne.getFactions()[7].diminuerApprobation(10);
        }
    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }
   
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           