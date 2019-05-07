package ex3;

import ex3.model.animaux.Animal;
import ex3.model.animaux.utils.ComportementAnimal;
import ex3.model.animaux.utils.TypeAnimal;
import ex3.model.zone.Aquarium;
import ex3.model.zone.FermeReptile;
import ex3.model.zone.SavaneAfricaine;
import ex3.model.zone.ZoneCarnivore;
import ex3.model.zoo.Zoo;

/**
 * point d'entrée de l'application
 * 
 * @author Kevin.s
 *
 */
public class ZooApplication {

	/**
	 * 
	 * @param args
	 *            non utilisé
	 */
	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		Aquarium aquarium = new Aquarium();
		FermeReptile fermeReptile = new FermeReptile();
		ZoneCarnivore zoneCarnivore = new ZoneCarnivore();
		SavaneAfricaine savaneAfricaine = new SavaneAfricaine();

		zoo.ajouterZone(aquarium);
		zoo.ajouterZone(fermeReptile);
		zoo.ajouterZone(zoneCarnivore);
		zoo.ajouterZone(savaneAfricaine);

		Animal gazelle = new Animal("Gazelle", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE);
		Animal zebre = new Animal("Zèbre", TypeAnimal.MAMMIFERE, ComportementAnimal.HERBIVORE);
		Animal lion = new Animal("Lion", TypeAnimal.MAMMIFERE, ComportementAnimal.CARNIVORE);
		Animal panthere = new Animal("Panthère", TypeAnimal.MAMMIFERE, ComportementAnimal.CARNIVORE);
		Animal requinBlanc = new Animal("Requin blanc", TypeAnimal.POISSON, ComportementAnimal.CARNIVORE);
		Animal truiteDoree = new Animal("Truite dorée", TypeAnimal.POISSON, ComportementAnimal.HERBIVORE);
		Animal boa = new Animal("Boa", TypeAnimal.REPTILE, ComportementAnimal.CARNIVORE);
		Animal python = new Animal("Python", TypeAnimal.REPTILE, ComportementAnimal.CARNIVORE);

		zoo.ajoutAnimal(gazelle);
		zoo.ajoutAnimal(zebre);
		zoo.ajoutAnimal(lion);
		zoo.ajoutAnimal(panthere);
		zoo.ajoutAnimal(requinBlanc);
		zoo.ajoutAnimal(truiteDoree);
		zoo.ajoutAnimal(boa);
		zoo.ajoutAnimal(python);

		zoo.afficherListeAnimaux();
	}

}
