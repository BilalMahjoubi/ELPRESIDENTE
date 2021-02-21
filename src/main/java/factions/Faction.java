package factions;

public class Faction {
    private int nb_Member;
    private String name;
    private int approval;

    public Faction(String name, int nb_Member, int approval) {
        this.name = name;
        this.approval = approval;
        this.nb_Member = nb_Member;

    }

    public void increaseApproval(int nb) {
        if (this.approval > 0) {
            this.approval += nb;
            this.maxApproval();
        }
    }

    public void decreaseApproval(int nb) {
        if (this.approval > 0) {
            this.approval -= nb;
            this.minApproval();
        }
    }

    public void maxApproval() {
        int max = 100;
        if (approval >= max) {
            approval = max;
        }
    }
    public void minApproval() {
        int min = 0;
        if (approval <= min) {
            approval = min;
        }
    }

    public int getApproval() {

        return approval;
    }

    public int satisfaction() {
        return nb_Member * approval;
    }


    public int getNbMember() {
        return nb_Member;
    }

    public String getName() {
        return name;
    }

    public void decreaseMember(int nb) {
        this.nb_Member = nb_Member - nb;
    }
}