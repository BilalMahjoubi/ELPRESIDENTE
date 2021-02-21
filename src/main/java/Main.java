import campaign.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisir une campagne (sable/galactic/hero/techno)");
        String campaign = sc.nextLine();
        switch (campaign) {
            case "sable" -> {
                Campaign c = new CampaignBacASable();
                String dif = c.choisirDifficulte();
                c.lancer(dif);
            }
            case "galactic" -> {
                Campaign c = new CampaignGalactic();
                String dif = c.choisirDifficulte();
                c.lancer(dif);
            }
            case "hero" -> {
                Campaign c = new CampaignSuperHeroes();
                String dif = c.choisirDifficulte();
                c.lancer(dif);
            }
            case "techno" -> {
                Campaign c = new CampaignTechno();
                String dif = c.choisirDifficulte();
                c.lancer(dif);
            }
        }
    }

}
