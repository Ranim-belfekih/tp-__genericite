package tp_genericite;

public class CompteEpergne<T> extends Compte <T> {
	private double taux;

	public CompteEpergne(int numeroCompte, double solde, T devise, double taux) {
		super(numeroCompte, solde, devise);
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	public double calculerInteret() {
		double interet=super.getSolde()*taux;
		super.setSolde(super.getSolde()+interet);
		return getSolde();
	}

	@Override
	public void afficherSolde() {
		System.out.println("Compte Epargne - solde"+calculerInteret()+" "+super.getDevise());
	}
	

}
