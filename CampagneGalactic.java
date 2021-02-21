package campagne;

import evenements.*;
import evenements.Galactic.InvasionEvenement;
import evenements.Galactic.MuskEvenement;
import evenements.Galactic.PlanetWarEvenement;
import evenements.Galactic.RessourcesGalacticEvenement;
import evenements.Galactic.VoyageGalacticEvenement;


public class CampagneGalactic extends Campagne {

	public CampagneGalactic() {
		super();
		evenements = new Evenement[] { new MuskEvenement(), new PlanetWarEvenement(), new RessourcesGalacticEvenement(), 
				new VoyageGalacticEvenement(), new InvasionEvenement()
				};
	}
}
