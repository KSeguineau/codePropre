package ex3.model.animaux.utils;

/**
 * représente le type d'un animal
 * 
 * @author Kevin.s
 *
 */
public enum TypeAnimal {

	MAMMIFERE("Mammifère"), OISEAU("Oiseau"), REPTILE("Reptile"), POISSON("Poisson");

	/** type : String */
	private String type;

	/**
	 * Constructeur
	 * 
	 * @param type
	 */
	private TypeAnimal(String type) {
		this.type = type;
	}

	/**
	 * Getter
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

}
