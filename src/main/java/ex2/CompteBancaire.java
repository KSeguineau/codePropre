package ex2;

/**
 * Représente un compte bancaire
 * 
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;

	/**
	 * @param solde
	 *            solde du compte
	 */
	public CompteBancaire(double solde) {
		super();
		this.solde = solde;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 *            montant à ajouter au solde
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * debite un montant au solde si c'est possible
	 * 
	 * @param montant
	 *            montant à débiter
	 */
	public abstract void debiterMontant(double montant);

	/**
	 * Getter pour solde
	 * 
	 * @return retourne le solde du compte
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter pour solde
	 * 
	 * @param solde
	 *            modifie le solde du compte
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

}
