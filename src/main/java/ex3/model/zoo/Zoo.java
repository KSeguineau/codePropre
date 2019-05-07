package ex3.model.zoo;

import java.util.ArrayList;
import java.util.List;

import ex3.model.animaux.Animal;
import ex3.model.zone.Zone;

/**
 * represente un zoo
 * 
 * @author Kevin.s
 *
 */
public class Zoo {

	/** nom : String */
	private String nom;
	/** listeZone : List<Zone> */
	private List<Zone> listeZone;

	/**
	 * Constructeur
	 * 
	 * @param nom
	 */
	public Zoo(String nom) {
		super();
		this.nom = nom;
		this.listeZone = new ArrayList<>();
	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param listeZone
	 */
	public Zoo(String nom, List<Zone> listeZone) {
		super();
		this.nom = nom;
		this.listeZone = listeZone;
	}

	/**
	 * essaye d'ajouter l'animal dans chaque zone jusqu'à la bonne
	 * 
	 * @param animal
	 *            animal à ajouter
	 */
	public void ajoutAnimal(Animal animal) {
		boolean ajoutReussi = false;
		for (int i = 0; i < listeZone.size(); i++) {
			ajoutReussi = listeZone.get(i).ajoutAnimal(animal);
			if (ajoutReussi) {
				break;
			}
		}
		if (ajoutReussi == false) {
			System.out.println("Cet animal ne peut être ajouté à aucune zones");
		}
	}

	/**
	 * permet d'ajouter une zone
	 * 
	 * @param zone
	 */
	public void ajouterZone(Zone zone) {
		listeZone.add(zone);
	}

	/**
	 * affiche la liste d'animaux de toutes les zones
	 */
	public void afficherListeAnimaux() {
		System.out.println(listeZone.toString());
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the listeZone
	 */
	public List<Zone> getListeZone() {
		return listeZone;
	}

	/**
	 * Setters
	 * 
	 * @param listeZone
	 *            the listeZone to set
	 */
	public void setListeZone(List<Zone> listeZone) {
		this.listeZone = listeZone;
	}

}
