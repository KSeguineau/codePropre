package ex3.model.zone;

import ex3.model.animaux.Animal;
import ex3.model.animaux.utils.TypeAnimal;

/**
 * représente la zone aquarium
 * 
 * @author Kevin.s
 *
 */
public class Aquarium extends Zone {

	/** POID_NOURRITURE_PAR_ANIMAL : double */
	private static final double POID_NOURRITURE_PAR_ANIMAL = 0.2;

	@Override
	public boolean ajoutAnimal(Animal animal) {
		if (animal != null && animal.getType().equals(TypeAnimal.POISSON)) {
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
