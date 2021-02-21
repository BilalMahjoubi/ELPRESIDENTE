package campagne;

import evenements.Evenement;
import evenements.evenementspolitique.FemmeEvenement;
import evenements.Galactic.*;
import evenements.evenementspolitique.GuerreEvenement;
import evenements.SuperHeros.CelluleEvenement;
import evenements.SuperHeros.CivilWarEvenement;
import evenements.SuperHeros.HeroesFightEvenement;
import evenements.Techno.ManifEvenement;
import evenements.Techno.PuceEvenement;
import evenements.Techno.RobotEvenement;
import evenements.Techno.VoitureEvenement;

public class CampagneBacASable extends Campagne {
    public CampagneBacASable() {
        super();
        evenements = new Evenement[] { new MuskEvenement(), new PlanetWarEvenement(), new RessourcesGalacticEvenement(),
                new VoyageGalacticEvenement(), new InvasionEvenement(), new CivilWarEvenement(), new HeroesFightEvenement(),
                new CelluleEvenement(), new ManifEvenement(), new PuceEvenement(), new RobotEvenement(), new VoitureEvenement(),
                new GuerreEvenement(), new FemmeEvenement()

        };
    }
}
