package campaign;

import events.Event;
import events.Galactic.*;
import events.SuperHeroes.CellHeroeEvent;
import events.SuperHeroes.CivilWarEvent;
import events.SuperHeroes.HeroesFightEvent;
import events.Techno.DemoEvent;
import events.Techno.PuceEvent;
import events.Techno.RobotEvent;
import events.Techno.VoitureEvent;
import events.politic.WarEvent;
import events.politic.WomanEvent;

public class CampaignBacASable extends Campaign {
    public CampaignBacASable() {
        super();
        evenements = new Event[] { new MuskEvent(), new PlanetWarEvent(), new RessourcesGalacticEvent(),
                new TripGalacticEvent(), new InvadeEvent(), new CivilWarEvent(), new HeroesFightEvent(),
                new CellHeroeEvent(), new DemoEvent(), new PuceEvent(), new RobotEvent(), new VoitureEvent(),
                new WarEvent(), new WomanEvent()

        };
    }
}
