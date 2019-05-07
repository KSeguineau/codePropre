package ex2;

/**
 * représente un compte courant
 * 
 * @author Kevin.s
 *
 */
public class CompteCourant extends CompteBancaire {

	/** decouvert : double decouvert autorisé */
	private double decouvert;

	/**
	 * Constructeur
	 * 
	 * @param solde
	 *            solde du compte
	 * @param decouvert
	 *            decouvert autorisé, le montant du decouvert en paramètre doit
	 *            etre négatif
	 */
	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}

	@Override
	public void debiterMontant(double montant) {

		if (this.solde - montant > decouvert) {
			this.solde = solde - montant;
		}
	}

	/**
	 * Getter pour decouvert
	 * 
	 * @return retourne le decouvert autorisé
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter pour decouvert
	 * 
	 * @param decouvert
	 *            modifie la valeur du decouvert
	 */

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}
