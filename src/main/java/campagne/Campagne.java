package campagne;

import evenements.*;
import factions.Faction;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Campagne {
	Faction[] factions;
	Evenement[] evenements;
	private Economie economie;

	public Campagne() {
		factions = new Faction[] { new Faction("Capitalistes", 11, 90), new Faction("Communistes", 30, 60),
				new Faction("Liberaux", 11, 90), new Faction("Religieux", 11, 90), new Faction("Militaristes", 11, 90),
				new Faction("Ecologistes", 11, 90), new Faction("Nationalistes", 11, 90),
				new Faction("Loyalistes", 11, 90) };
		economie = new Economie(1000, 100, 12, 12);
	}

	public void lancer(String difficlute) {
		int choix;
		ArrayList<Integer> evenementpassé = new ArrayList<>(); 
		
		Random r = new Random();
		int get;
		int nb_evenement = 0;
		boolean echec = false;
		boolean quit = false;
		Scanner sc = new Scanner(System.in);
		EvenementFinAnnee fin = new EvenementFinAnnee();
		while (!echec) {
			while (nb_evenement != 4) {
				get = r.nextInt(evenements.length);
				if (!evenementpassé.contains(get)) {
					evenements[get].toString();
					choix = sc.nextInt();
					if (difficlute.equals("n")) {
						evenements[get].consequences(choix, economie, this);
					} else if (difficlute.equals("f")) {
						evenements[get].consequencesFacile(choix, economie, this);
					}
					evenementpassé.add(get);
					++nb_evenement;
				}
				
			}
			while (!quit) {
				fin.toString();
				choix = sc.nextInt();
				fin.consequences(choix, economie, this);
				quit = quitter();
			}

			echec = bilan(economie);
			evenementpassé.clear();
			quit = false;
			nb_evenement = 0;
		}

	}

	public boolean bilan(Economie e) {
		int satisfaction_globale = 0;
		int nb_total = 0;
		int nourriture_total;
		for (Faction f : factions) {
			satisfaction_globale += f.satisfaction();
			nb_total += f.getNb_adherant();
		}
		satisfaction_globale /= nb_total;
		System.out.println(satisfaction_globale);
		nourriture_total = e.nourritureTotale(this);
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
		System.out.println("Choisir un niveau de difficulté (f/n)");
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
}
