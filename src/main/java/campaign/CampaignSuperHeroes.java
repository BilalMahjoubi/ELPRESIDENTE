package campaign;

import events.*;
import events.SuperHeroes.CellHeroeEvent;
import events.SuperHeroes.CivilWarEvent;
import events.SuperHeroes.HeroesFightEvent;


public class CampaignSuperHeroes extends Campaign {

	public CampaignSuperHeroes() {
		super();
		evenements = new Event[] { new CivilWarEvent(), new HeroesFightEvent(), new CellHeroeEvent(), };
	}
}
