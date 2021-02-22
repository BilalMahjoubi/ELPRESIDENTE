package economy;

import factions.Faction;

import java.util.Random;
import java.util.Scanner;

import campaign.Campaign;

public class Economy {
    private int surface;
    private int treasury;
    private int food;
    private int industry;
    private int agriculture;

    public Economy(int treasury, int food, int industry, int agriculture) {
        this.surface = 100;
        this.agriculture = agriculture;
        this.treasury = treasury;
        this.food = food;
        this.industry = industry;
        this.surface = surface - (agriculture + industry);
    }

    public int getTreasury() {
        return treasury;
    }
    
    public int getAgriculture() {
		return agriculture;
    }
    
    public int getIndustry() {
    	return industry;
    }
    
    public void variationIndustry(int number, int variation ) {
        if(variation == 1) {
            if (surface > 0) {
                this.industry = this.industry + number;
                this.surface = this.surface - number;
            }
            
        }
        else {
            this.industry = this.industry - number;
            this.surface = this.surface + number;
            
        }
        


    }

    

    public void variationAgriculture(int number, int variation) {
        if(variation == 1){
            if (surface > 0) {
                this.agriculture = this.industry + number;
                this.surface = this.surface - number;

            }
        }
        else {
            this.agriculture = this.industry - number;
            this.surface = this.surface + number;

        }


    }



    public void increaseTreasury() {
        this.treasury += this.industry * 10;
    }
    public void decreaseTreasury(int nb) {
        this.treasury -= nb;
    }

    public void increaseFood() {
        this.food += this.agriculture * 40;
    }

    public int foodTotal(Campaign campaign) {
        int nb_adherant = 0;
        int total_nourriture;
        for (Faction f : campaign.getFactions()) {
            nb_adherant += f.getNbMember();
        }

        total_nourriture = food / nb_adherant;
        return total_nourriture;


    }

    public void marketFood() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre d'unité de nourriture à acheter : ");
        int nb_food = sc.nextInt();
        if(nb_food * 8 < treasury) {
            food = food + nb_food;
            treasury = treasury - (nb_food * 8);

        }
        else {
            System.out.println("Vous n'avez pas assez d'argent !");
        }



    }
    public int potDeVin(Campaign campagne) {
        int cmp = 0;
        int choice;
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisir  une faction à soudoyer (Saisir le numéro): ");
        for(Faction f : campagne.getFactions()){
            System.out.println(cmp +"-" + f.getName() + " (" + f.getApproval() +" d'approbation)");
            ++cmp;
        }
        choice = sc.nextInt();
        Faction f = campagne.getFactions()[choice];
        amount = f.getNbMember() * 15;
        if (treasury >= amount) {
            campagne.getFactions()[choice].increaseApproval(10);
            treasury = treasury - amount;
            return amount;
        }
        else {
            System.out.println("Vous n'avez pas assez d'argent.");
            return 0;
        }

    }

    public void elimination(Campaign c){
        int total = foodTotal(c);
        int faction_random;
        Random r = new Random();
        while (total < 4) {
            faction_random = r.nextInt(c.getFactions().length);
            c.getFactions()[faction_random].decreaseMember(1);
            c.getFactions()[faction_random].decreaseApproval(2);
            total = foodTotal(c);

        }



    }



}