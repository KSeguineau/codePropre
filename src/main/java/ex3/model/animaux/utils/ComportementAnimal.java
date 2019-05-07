package ex3.model.animaux.utils;

/**
 * représente les différents comportement alimentaire des animaux
 * 
 * @author Kevin.s
 *
 */
public enum ComportementAnimal {

	CARNIVORE("Carnivore"), HERBIVORE("Herbivore"), OMNIVORE("Omnivore"), INSECTIVORE("Insectivore");

	/** comportement : String */
	private String comportement;

	/**
	 * Constructeur
	 * 
	 * @param comportement
	 */
	private ComportementAnimal(String comportement) {
		this.comportement = comportement;
	}

	/**
	 * Getter
	 * 
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}

}
