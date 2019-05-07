package ex3.model.zone;

import ex3.model.animaux.Animal;
import ex3.model.animaux.utils.TypeAnimal;

/**
 * represente la zone ferme des reptiles
 * 
 * @author Kevin.s
 *
 */
public class FermeReptile extends Zone {

	/** POID_NOURRITURE_PAR_ANIMAL : double */
	private static final double POID_NOURRITURE_PAR_ANIMAL = 0.1;

	@Override
	public boolean ajoutAnimal(Animal animal) {
		if (animal != null && animal.getType().equals(TypeAnimal.REPTILE)) {
			listeAnimaux.add(animal);
			return true;
		}
		return false;
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return listeAnimaux.size() * POID_NOURRITURE_PAR_ANIMAL;
	}

}
