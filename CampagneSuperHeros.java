package campagne;

import evenements.*;
import evenements.SuperHeros.CelluleEvenement;
import evenements.SuperHeros.CivilWarEvenement;
import evenements.SuperHeros.HeroesFightEvenement;


public class CampagneSuperHeros extends Campagne {

	public CampagneSuperHeros() {
		super();
		evenements = new Evenement[] { new CivilWarEvenement(), new HeroesFightEvenement(), new CelluleEvenement(), };
	}
}
