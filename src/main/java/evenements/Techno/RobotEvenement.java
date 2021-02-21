package evenements.Techno;

import campagne.Campagne;
import economie.Economie;
import evenements.Evenement;

public class RobotEvenement extends Evenement{
    private final String description;

    public RobotEvenement() {
        super();
        this.description = "L'Intelligence Artificielle se rebelle face à ses créateurs et veut tout anéantir.";
        this.ajouterChoix("1- Se laisser abattre et se soumettre aux robots pendant un une saison");
        this.ajouterChoix("2- Prendre les armes pour contre attaquer");
        this.ajouterChoix("3- Payer le hacker le plus experimenté pour arrêter cette attaque (il est très égoiste attend qu'on le paye extrêmement cher...)");
    }

    @Override
    public void consequences( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
            campagne.getFactions()[0].diminuerApprobation(7);
            campagne.getFactions()[1].diminuerApprobation(7);
            campagne.getFactions()[2].diminuerApprobation(7);
            campagne.getFactions()[3].diminuerApprobation(7);
            campagne.getFactions()[4].augmenterApprobation(10);
            campagne.getFactions()[7].augmenterApprobation(10);
        }
        else if (choix == 2){
        	campagne.getFactions()[4].augmenterApprobation(15);
        	campagne.getFactions()[6].diminuerApprobation(7);
        	campagne.getFactions()[2].diminuerApprobation(10);
        }
        else if (choix == 3){
        	campagne.getFactions()[0].augmenterApprobation(15);
        	campagne.getFactions()[1].diminuerApprobation(10);
        }
    }

    @Override
    public void consequencesFacile(int choix, Economie e, Campagne campagne) {
    	if(choix == 1){
            campagne.getFactions()[0].diminuerApprobation(5);
            campagne.getFactions()[1].diminuerApprobation(5);
            campagne.getFactions()[2].diminuerApprobation(5);
            campagne.getFactions()[3].diminuerApprobation(5);
            campagne.getFactions()[4].augmenterApprobation(20);
            campagne.getFactions()[7].augmenterApprobation(20);
        }
        else if (choix == 2){
        	campagne.getFactions()[4].augmenterApprobation(30);
        	campagne.getFactions()[6].diminuerApprobation(5);
        	campagne.getFactions()[2].diminuerApprobation(5);
        }
        else if (choix == 3){
        	campagne.getFactions()[0].augmenterApprobation(30);
        	campagne.getFactions()[1].diminuerApprobation(5);
        }

    }
    
    public void consequencesDifficile( int choix, Economie e, Campagne campagne) {
        if(choix == 1){
            campagne.getFactions()[0].diminuerApprobation(10);
            campagne.getFactions()[1].diminuerApprobation(10);
            campagne.getFactions()[2].diminuerApprobation(10);
            campagne.getFactions()[3].diminuerApprobation(10);
            campagne.getFactions()[4].augmenterApprobation(5);
            campagne.getFactions()[7].augmenterApprobation(5);
        }
        else if (choix == 2){
        	campagne.getFactions()[4].augmenterApprobation(7);
        	campagne.getFactions()[6].diminuerApprobation(10);
        	campagne.getFactions()[2].diminuerApprobation(15);
        }
        else if (choix == 3){
        	campagne.getFactions()[0].augmenterApprobation(10);
        	campagne.getFactions()[1].diminuerApprobation(20);
        }
    }

    @Override
    public String getDescription() {
        String s ="";
        System.out.println(description);
        return s;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           