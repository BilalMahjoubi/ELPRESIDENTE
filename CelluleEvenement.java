package evenements.SuperHeros;

import campagne.Campagne;
import evenements.Economie;
import evenements.Evenement;
import factions.Faction;

public class CelluleEvenement extends Evenement{
    private final String description;

    public CelluleEvenement() {
        super();
        this.description = "Une cellule souche des super héros a été découverte et la transmission dans un rat de laboratoire fut un succès PHENOMENAL";
        this.ajouterChoix("1- Obliger tous les civils à porter cette cellule en eux et désormais avoir un pouvoir");
        this.ajouterChoix("2- Se rendre le plus fort super héros de la planète...");
    }

    @Override
    public void consequences( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
            campagne.getFactions()[2].diminuerApprobation(30);
            campagne.getFactions()[4].augmenterApprobation(30);


        }
        else if (choix == 2){
            campagne.getFactions()[7].augmenterApprobation(40);
            campagne.getFactions()[2].diminuerApprobation(20);

        }

    }

    @Override
    public void consequencesFacile(int choix, Economie e, Campagne campagne) {
    	if(choix == 1){
            campagne.getFactions()[2].diminuerApprobation(15);
            campagne.getFactions()[4].augmenterApprobation(45);


        }
        else if (choix == 2){
            campagne.getFactions()[7].augmenterApprobation(60);
            campagne.getFactions()[2].diminuerApprobation(10);
        }
    }
    
    @Override
	public void consequencesDifficile(int choix, Economie e, Campagne campagne) {
    	if(choix == 1){
            campagne.getFactions()[2].diminuerApprobation(45);
            campagne.getFactions()[4].augmenterApprobation(15);


        }
        else if (choix == 2){
            campagne.getFactions()[7].augmenterApprobation(20);
            campagne.getFactions()[2].diminuerApprobation(35);

        }
	}
    
    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

	

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           