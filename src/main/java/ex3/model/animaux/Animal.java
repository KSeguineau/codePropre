package ex3.model.animaux;

import ex3.model.animaux.utils.ComportementAnimal;
import ex3.model.animaux.utils.TypeAnimal;

/**
 * represente un animal
 * 
 * @author Kevin.s
 *
 */
public class Animal {

	/** nom : String */
	protected String nom;
	/** type : TypeAnimal */
	protected TypeAnimal type;
	/** comportement : ComportementAnimal */
	protected ComportementAnimal comportement;

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param type
	 * @param comportement
	 */
	public Animal(String nom, TypeAnimal type, ComportementAnimal comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}

	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", type=" + type + ", comportement=" + comportement + "]";
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setters
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
	 * @return the type
	 */
	public TypeAnimal getType() {
		return type;
	}

	/**
	 * Setters
	 * 
	 * @param type
	 *            the type to set
	 */
	public void setType(TypeAnimal type) {
		this.type = type;
	}

	/**
	 * Getter
	 * 
	 * @return the comportement
	 */
	public ComportementAnimal getComportement() {
		return comportement;
	}

	/**
	 * Setters
	 * 
	 * @param comportement
	 *            the comportement to set
	 */
	public void setComportement(ComportementAnimal comportement) {
		this.comportement = comportement;
	}

}
