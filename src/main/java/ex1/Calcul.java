package ex1;

/**
 * classe contenant des méthodes de calcul
 * 
 * @author Kevin.s
 *
 */
public class Calcul {

	/**
	 * Constructeur
	 * 
	 */
	private Calcul() {
		super();
	}

	/**
	 * @param a
	 *            entier à additionner
	 * @param b
	 *            entier à additionner
	 * @return le résultat de l'addition de a et b
	 */
	public static int addition(int a, int b) {
		return a + b;
	}

	/**
	 * @param a
	 *            entier auquel on soustrait
	 * @param b
	 *            entier que l'on soustrait
	 * @return le résultat de la soustraction a-b
	 */
	public static int soustraction(int a, int b) {
		return a - b;
	}
}
