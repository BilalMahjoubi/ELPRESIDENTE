package evenements;
import campagne.Campagne;
import factions.Faction;

import java.util.ArrayList;

public abstract class Evenement {
    private ArrayList<String> choix;
    public Evenement() {
        choix  = new ArrayList<String>();

    }
    public void ajouterChoix(String c) {
        choix.add(c);

    }
    public String afficherChoix(){
        String s = "";
        for( String choix : choix) {
            System.out.println(choix);
        }
        return s;
    }

    public ArrayList<String> getChoix() {
        return choix;
    }

    @Override
    public String toString() {
        return getDescription() + "\n" + afficherChoix();
    }

    public abstract void consequences( int choix, Economie e, Campagne campagne);
    public abstract void consequencesFacile( int choix, Economie e, Campagne campagne);
    public abstract void consequencesDifficile( int choix, Economie e, Campagne campagne);

    public abstract String getDescription();



}
