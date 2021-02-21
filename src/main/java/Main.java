import campagne.Campagne;
import campagne.CampagneGalactic;

public class Main {
    public static void main(String[] args) {
        Campagne c = new CampagneGalactic();
        String dif = c.choisirDifficulte();
        c.lancer(dif);

    }

}
