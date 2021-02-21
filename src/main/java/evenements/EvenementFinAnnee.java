package evenements;

import factions.Faction;
import campagne.Campagne;

public class EvenementFinAnnee extends Evenement {
    private final String description;

    public EvenementFinAnnee() {
        this.description = "C'est la fin d'année ! Il est temps de faire le bilan.";
        this.ajouterChoix("1-Acceder au marche alimentaire");
        this.ajouterChoix("2-Faire un pot de vin");

    }


    @Override
    public void consequences(int choix, Economie e, Campagne campagne) {
        if (choix == 1) {
            e.marcheAlimentaire();

        } else if (choix == 2) {
            e.potDeVin(campagne);
        }

    }

    @Override
    public void consequencesFacile(int choix, Economie e, Campagne campagne) {

    }

    @Override
    public String getDescription() {
        String s = "";
        System.out.println(description);
        return s;
    }

}
