package tp_genericite;

public class CompteCourant<T> extends Compte<T> {
	private double limiteAutorisation ;

	public CompteCourant(int numeroCompte, double solde, T devise, double limiteAutorisation) {
		super(numeroCompte, solde, devise);
		this.limiteAutorisation = limiteAutorisation;
	}

	public double getLimiteAutorisation() {
		return limiteAutorisation;
	}

	public void setLimiteAutorisation(double limiteAutorisation) {
		this.limiteAutorisation = limiteAutorisation;
	}

	@Override
	public void retirer(double montant) {
		if (montant>0 && (super.getSolde()-montant)>= -limiteAutorisation) {
			super.setSolde(super.getSolde()-montant);
			System.out.println(montant+" "+super.getDevise()+"retiré avec succes");
		}
	}

	@Override
	public void afficherSolde() {
		System.out.println("compte courant - solde: "+super.getSolde()+" "+super.getDevise());
		
	}
	
	

}
