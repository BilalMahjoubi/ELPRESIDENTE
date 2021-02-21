package campaign;

import events.*;
import events.Galactic.InvadeEvent;
import events.Galactic.MuskEvent;
import events.Galactic.PlanetWarEvent;
import events.Galactic.RessourcesGalacticEvent;
import events.Galactic.TripGalacticEvent;


public class CampaignGalactic extends Campaign {

	public CampaignGalactic() {
		super();
		evenements = new Event[] { new MuskEvent(), new PlanetWarEvent(), new RessourcesGalacticEvent(), 
				new TripGalacticEvent(), new InvadeEvent()
				};
	}
}
