package campaign;

import factions.Faction;

import java.util.Random;
import java.util.Scanner;

import economy.Economy;
import events.*;

import java.util.ArrayList;

public class Campaign {
    private Faction[] factions;
    Event[] evenements;
    private Economy economy;
    private EventYearEnd fin;

    public Campaign() {
        factions = new Faction[]{new Faction("Capitalistes", 15, 50), new Faction("Communistes", 30, 50),
                new Faction("Liberaux", 15, 90), new Faction("Religieux", 15, 50), new Faction("Militaristes", 15, 50),
                new Faction("Ecologistes", 15, 50), new Faction("Nationalistes", 15, 50),
                new Faction("Loyalistes", 15, 50)};
        fin = new EventYearEnd();
        economy = new Economy(10000, 100, 15, 15);
    }

    public void lancer(String difficulte) {
        ArrayList<Integer> evenementpasse = new ArrayList<>();
        int nb_evenement = 0;
        int years = 1;
        boolean echec = false;
        economy.increaseFood();
        while (!echec) {
            launchEvent(nb_evenement, difficulte, evenementpasse);
            economy.increaseFood();
            economy.increaseTreasury();
            launchEndYear();
            echec = bilan(economy);
            evenementpasse.clear();
            nb_evenement = 0;
        }
        System.out.println("Vous avez perdu ! Le peuple vous a destitué de vos fonctions et pendu. Vous avez tenu : " + years + " ans");
    }

    public boolean bilan(Economy e) {
        int satisfaction_globale = 0;
        int nb_total = 0;
        int nourriture_total;
        for (Faction f : factions) {
            satisfaction_globale += f.satisfaction();
            nb_total += f.getNbMember();
        }
        satisfaction_globale /= nb_total;
        System.out.println("Taux de satisfaction global sur l'année  : " + satisfaction_globale + " %");
        nourriture_total = e.foodTotal(this);
        if (nourriture_total < 4) {
            e.elimination(this);
        }

        return satisfaction_globale < 50;
    }

    public Faction[] getFactions() {
        return factions;
    }

    public String choisirDifficulte() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisir un niveau de difficulté (f/n/d)");
        return sc.nextLine();
    }

    public boolean quitter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voulez vous passer à la suite ? (y/n)");
        String quitter = sc.nextLine();
        if (quitter.equals("y")) {
            return true;
        }
        return false;
    }

    public void start() {
        System.out.println("\n"
                + "######## ##          ########  ########  ########  ######  #### ########  ######## ##    ## ######## ######## \n"
                + "##       ##          ##     ## ##     ## ##       ##    ##  ##  ##     ## ##       ###   ##    ##    ##       \n"
                + "##       ##          ##     ## ##     ## ##       ##        ##  ##     ## ##       ####  ##    ##    ##       \n"
                + "######   ##          ########  ########  ######    ######   ##  ##     ## ######   ## ## ##    ##    ######   \n"
                + "##       ##          ##        ##   ##   ##             ##  ##  ##     ## ##       ##  ####    ##    ##       \n"
                + "##       ##          ##        ##    ##  ##       ##    ##  ##  ##     ## ##       ##   ###    ##    ##       \n"
                + "######## ########    ##        ##     ## ########  ######  #### ########  ######## ##    ##    ##    ######## \n"
                + "");
    }

    public void getApprobationTotal() {
        int cmp = 0;
        System.out.println("\n///////// VOTRE APPROBATION ACTUELLE PAR FACTION /////////\n");
        for (Faction f : factions) {
            System.out.println(cmp + "-" + f.getName() + " (" + f.getApproval() + " d'approbation)");
            ++cmp;
        }
        System.out.println("------------------------------------");
        System.out.println("Votre trésorerie : " + economy.getTreasury() + " €");
        System.out.println("Votre agriculture : " + economy.getAgriculture() + " %");
        System.out.println("Votre industrie : " + economy.getIndustry() + " %");
        System.out.println("Nombre d'unité de nourriture par personne : " + economy.foodTotal(this) + "unités ");
        System.out.println("\n//////////////////////////////////////////////////////////\n");
    }

    public void launchEvent(int nb_evenement, String difficulte, ArrayList<Integer> evenementpassé) {
        Random r = new Random();
        int choix;
        Scanner sc = new Scanner(System.in);
        int get;
        while (nb_evenement != 4) {
            get = r.nextInt(evenements.length);
            if (!evenementpassé.contains(get)) {
                evenements[get].toString();
                choix = sc.nextInt();
                switch (difficulte) {
                    case "n" -> evenements[get].consequences(choix, economy, this);
                    case "f" -> evenements[get].consequencesEasy(choix, economy, this);
                    case "d" -> evenements[get].consequencesHard(choix, economy, this);
                }
                evenementpassé.add(get);
                getApprobationTotal();
                ++nb_evenement;
            }
        }

    }
    public void launchEndYear(){
        boolean quit = false;
        Scanner sc = new Scanner(System.in);
        int choix;
        while (!quit) {
            fin.toString();
            choix = sc.nextInt();
            fin.consequences(choix, economy, this);
            quit = quitter();
        }
    }
}