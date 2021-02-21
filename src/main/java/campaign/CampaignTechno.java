package campaign;

import events.*;
import events.Techno.DemoEvent;
import events.Techno.PuceEvent;
import events.Techno.RobotEvent;
import events.Techno.VoitureEvent;



public class CampaignTechno extends Campaign {

	public CampaignTechno() {
		super();
		evenements = new Event[] { new DemoEvent(), new PuceEvent(), new RobotEvent(), new VoitureEvent()};
	}
}
