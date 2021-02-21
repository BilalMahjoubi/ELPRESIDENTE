package evenements.Galactic;

import campagne.Campagne;
import economie.Economie;
import evenements.Evenement;

public class VoyageGalacticEvenement extends Evenement{
    private final String description;

    public VoyageGalacticEvenement() {
        super();
        this.description = "Afin de mieux connaître l'univers, investissez dans un voyage spatial qui va être organisé au profit de vos habitants ";
        this.ajouterChoix("1- Voyager le plus proche du soleil");
        this.ajouterChoix("2- Voyager le plus loin du soleil");
        this.ajouterChoix("3- Prenez le risque des trous noirs");

    }

    @Override
    public void consequences( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
            campagne.getFactions()[2].augmenterApprobation(3);
            campagne.getFactions()[3].diminuerApprobation(5);
            campagne.getFactions()[0].augmenterApprobation(5);
        }
        else if (choix == 2){
        	campagne.getFactions()[2].augmenterApprobation(3);
        	campagne.getFactions()[3].diminuerApprobation(5);
        	campagne.getFactions()[1].augmenterApprobation(5);
        }
        else if(choix == 3) {
        	campagne.getFactions()[2].augmenterApprobation(3);
        	campagne.getFactions()[3].diminuerApprobation(5);
        	campagne.getFactions()[7].augmenterApprobation(5);
        }
    }

    @Override
    public void consequencesFacile(int choix, Economie e, Campagne campagne) {
    	if(choix == 1){
            campagne.getFactions()[2].augmenterApprobation(5);
            campagne.getFactions()[3].diminuerApprobation(2);
            campagne.getFactions()[0].augmenterApprobation(10);
        }
        else if (choix == 2){
        	campagne.getFactions()[2].augmenterApprobation(5);
        	campagne.getFactions()[3].diminuerApprobation(2);
        	campagne.getFactions()[1].augmenterApprobation(10);
        }
        else if(choix == 3) {
        	campagne.getFactions()[2].augmenterApprobation(5);
        	campagne.getFactions()[3].diminuerApprobation(2);
        	campagne.getFactions()[7].augmenterApprobation(10);
        }

    }
    
	@Override
	public void consequencesDifficile(int choix, Economie e, Campagne campagne) {
		if(choix == 1){
            campagne.getFactions()[2].augmenterApprobation(2);
            campagne.getFactions()[3].diminuerApprobation(10);
            campagne.getFactions()[0].augmenterApprobation(2);
        }
        else if (choix == 2){
        	campagne.getFactions()[2].augmenterApprobation(2);
        	campagne.getFactions()[3].diminuerApprobation(10);
        	campagne.getFactions()[1].augmenterApprobation(2);
        }
        else if(choix == 3) {
        	campagne.getFactions()[2].augmenterApprobation(2);
        	campagne.getFactions()[3].diminuerApprobation(10);
        	campagne.getFactions()[7].augmenterApprobation(2);
        }
	}

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }


}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           