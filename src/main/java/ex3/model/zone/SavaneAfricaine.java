package ex3.model.zone;

import ex3.model.animaux.Animal;
import ex3.model.animaux.utils.ComportementAnimal;
import ex3.model.animaux.utils.TypeAnimal;

/**
 * représente la zone savane africaine
 * 
 * @author Kevin.s
 *
 */
public class SavaneAfricaine extends Zone {

	/** POID_NOURRITURE_PAR_ANIMAL : int */
	private static final int POID_NOURRITURE_PAR_ANIMAL = 10;

	@Override
	public boolean ajoutAnimal(Animal animal) {
		boolean mammifere = animal.getType().equals(TypeAnimal.MAMMIFERE);
		boolean herbivore = animal.getComportement().equals(ComportementAnimal.HERBIVORE);

		if (animal != null && mammifere && herbivore) {
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
