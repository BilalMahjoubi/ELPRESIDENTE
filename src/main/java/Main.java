import campagne.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisir une campagne (sable/galactic/hero/techno)");
        String campagne = sc.nextLine();
        switch (campagne) {
            case "sable" -> {
                Campagne c = new CampagneBacASable();
                String dif = c.choisirDifficulte();
                c.lancer(dif);
            }
            case "galactic" -> {
                Campagne c = new CampagneGalactic();
                String dif = c.choisirDifficulte();
                c.lancer(dif);
            }
            case "hero" -> {
                Campagne c = new CampagneSuperHeros();
                String dif = c.choisirDifficulte();
                c.lancer(dif);
            }
            case "techno" -> {
                Campagne c = new CampagneTechno();
                String dif = c.choisirDifficulte();
                c.lancer(dif);
            }
        }
    }

}
