import campagne.*;


public class Main {
    public static void main(String[] args) {
        Campagne c = new CampagneGalactic();
        c.start();
        String dif = c.choisirDifficulte();
        c.lancer(dif);
    }

}
