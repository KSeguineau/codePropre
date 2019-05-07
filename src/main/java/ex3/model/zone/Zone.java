package ex3.model.zone;

import java.util.ArrayList;
import java.util.List;

import ex3.model.animaux.Animal;

/**
 * représente une zone du zoo
 * 
 * @author Kevin.s
 *
 */
public abstract class Zone {

	/** listeAnimaux : List<Animal> */
	List<Animal> listeAnimaux;

	/**
	 * Constructeur
	 * 
	 */
	public Zone() {
		super();
		this.listeAnimaux = new ArrayList<Animal>();
	}

	/**
	 * Constructeur
	 * 
	 * @param listeAnimaux
	 */
	public Zone(List<Animal> listeAnimaux) {
		super();
		this.listeAnimaux = listeAnimaux;
	}

	/**
	 * vérifie si l'animal peut être ajouté à la zone et si c'est le cas, il
	 * l'ajoute
	 * 
	 * @param animal
	 * @return vrai si l'animal a été ajouté sinon faux
	 */
	public abstract boolean ajoutAnimal(Animal animal);

	/**
	 * permet de calculer le poid de nourriture totale pour tous les animaux de
	 * la zone
	 * 
	 * @return
	 */
	public abstract double calculerKgsNourritureParJour();

	/**
	 * affiche tous les animaux de la zone
	 */
	public void afficherListeAnimaux() {
		listeAnimaux.forEach(animaux -> System.out.println(animaux.toString()));
	}

	/**
	 * 
	 * @return le nombre d'animaux de la zone
	 */
	public int compterAnimaux() {
		return listeAnimaux.size();
	}

	@Override
	public String toString() {
		return "Zone [listeAnimaux=" + listeAnimaux + "]";
	}

	/**
	 * Getter
	 * 
	 * @return the listeAnimaux
	 */
	public List<Animal> getListeAnimaux() {
		return listeAnimaux;
	}

}
