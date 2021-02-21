package factions;

public class Faction {
    private int nb_adherant;
    private String nom;
    private int approbation;

    public Faction(String nom, int nb_adherant, int approbation) {
        this.nom = nom;
        this.approbation = approbation;
        this.nb_adherant = nb_adherant;

    }

    public void augmenterApprobation(int nombre) {
        if (this.approbation > 0) {
            this.approbation += nombre;
            this.approbationMax();
        }
    }

    public void diminuerApprobation(int nombre) {
        if (this.approbation > 0) {
            this.approbation -= nombre;
            this.approbationMin();
        }
    }

    public void approbationMax() {
        int max = 100;
        if (approbation >= max) {
            approbation = max;
        }
    }
    public void approbationMin() {
        int min = 0;
        if (approbation <= min) {
            approbation = min;
        }
    }

    public int getApprobation() {

        return approbation;
    }

    public int satisfaction() {
        return nb_adherant * approbation;
    }


    public int getNb_adherant() {
        return nb_adherant;
    }

    public String getNom() {
        return nom;
    }

    public void diminuerAdherant(int nombre) {
        this.nb_adherant = nb_adherant - nombre;
    }
}