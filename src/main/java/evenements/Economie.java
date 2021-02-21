package evenements;

import campagne.Campagne;
import factions.Faction;

import java.util.Random;
import java.util.Scanner;

public class Economie {
    private int surface;
    private int tresorie;
    private int nourriture;
    private int industrie;
    private int agriculture;

    public Economie(int tresorie, int nourriture, int industrie, int agriculture) {
        this.surface = 100;
        this.agriculture = agriculture;
        this.tresorie = tresorie;
        this.nourriture = nourriture;
        this.industrie = industrie;
        this.surface = surface - (agriculture + industrie);
    }

    public int getTresorie() {
        return tresorie;
    }

    public void augmenterIndustrie(int augmentation) {
        if (surface > 0) {
            this.industrie = this.industrie + augmentation;
            this.surface = this.surface - augmentation;
            System.out.println("-----" + this.industrie + "-----" + this.surface);
        }


    }

    public void diminuerIndustrie(int diminuer) {
        this.industrie = this.industrie - diminuer;
        this.surface = this.surface + diminuer;
    }

    public void augmenterAgriculture(int augmentation) {
        if (surface > 0) {
            this.agriculture = this.industrie + augmentation;
            this.surface = this.surface - augmentation;
            System.out.println(this.industrie + this.surface);


        }

    }

    public void diminuerAgriculture(int diminuer) {
        this.agriculture = this.industrie - diminuer;
        this.surface = this.surface + diminuer;
    }

    public void augmenterTrésorerie() {
        this.tresorie = this.industrie * 10;
    }
    public void diminuerTrésorerie(int nb) {
        this.tresorie -= nb;
    }

    public void augmenterNourriture() {
        this.nourriture = this.agriculture * 40;
    }

    public int nourritureTotale(Campagne campagne) {
        int nb_adherant = 0;
        int total_nourriture;
        for (Faction f : campagne.getFactions()) {
            nb_adherant += f.getNb_adherant();
        }

        total_nourriture = nourriture / nb_adherant;
        System.out.println(total_nourriture);
        return total_nourriture;


    }

    public void marcheAlimentaire() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre d'unité de nourriture à acheter : ");
        int nb_nourriture = sc.nextInt();
        if(nb_nourriture * 8 < tresorie) {
            nourriture = nourriture + nb_nourriture;
            tresorie = tresorie - (nb_nourriture * 8);

        }
        else {
            System.out.println("Vous n'avez pas assez d'argent !");
        }



    }
    public void potDeVin(Campagne campagne) {
        int cmp = 0;
        int choix;
        int montant;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisir  une faction à soudoyer (Saisir le numéro): ");
        for(Faction f : campagne.getFactions()){
            System.out.println(cmp +"-" + f.getNom() + " (" + f.getApprobation() +" d'approbation)");
            ++cmp;
        }
        choix = sc.nextInt();
        Faction f = campagne.getFactions()[choix];
        montant = f.getNb_adherant() * 15;
        if (tresorie >= montant) {
            campagne.getFactions()[choix].augmenterApprobation(10);
            tresorie = tresorie - montant;
        }
        else {
            System.out.println("Vous n'avez pas assez d'argent.");
        }

    }

    public void elimination(Campagne c){
        int total = nourritureTotale(c);
        int faction_random;
        Random r = new Random();
        while (total < 4) {
            System.out.println("ypooooooooooooo");
            faction_random = r.nextInt(c.getFactions().length);
            c.getFactions()[faction_random].diminuerAdherant(1);
            c.getFactions()[faction_random].diminuerApprobation(2);
            total = nourritureTotale(c);

        }



    }



}


