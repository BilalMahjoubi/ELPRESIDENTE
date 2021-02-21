package campagne;

import evenements.*;
import evenements.Techno.ManifEvenement;
import evenements.Techno.PuceEvenement;
import evenements.Techno.RobotEvenement;
import evenements.Techno.VoitureEvenement;



public class CampagneTechno extends Campagne {

	public CampagneTechno() {
		super();
		evenements = new Evenement[] { new ManifEvenement(), new PuceEvenement(), new RobotEvenement(), new VoitureEvenement()};
	}
}
