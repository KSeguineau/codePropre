package ex2;

/**
 * représente un Livret A
 * 
 * @author Kevin.s
 *
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération du livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur
	 * 
	 * @param solde
	 *            solde du compte
	 * @param tauxRemuneration
	 *            taux de remuneration du compte, doit être compris entre 0 et 1
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public void debiterMontant(double montant) {

		if (this.solde - montant > 0) {
			this.solde = solde - montant;
		}
	}

	/**
	 * méthode qui ajoute la rémunération au solde
	 */
	public void appliquerRemuAnnuelle() {
		ajouterMontant(solde * tauxRemuneration);
	}

	/**
	 * Getter pour tauxRemuneration
	 * 
	 * @return tauxRemuneration retourne le taux de remuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter pour tauxRemuneration
	 * 
	 * @param tauxRemuneration
	 *            modifie le taux de remuneration
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
