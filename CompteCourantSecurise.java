package tp_genericite;

public class CompteCourantSecurise<T> extends CompteCourant implements Securise {
	private String identifiantSecurise;

	public CompteCourantSecurise(int numeroCompte, double solde,T devise, double limiteAutorisation,
			String identifiantSecurise) {
		super(numeroCompte, solde, devise, limiteAutorisation);
		this.identifiantSecurise = identifiantSecurise;
	}
	@Override
	public boolean verifierIdentite(String identifiant) {
        return identifiantSecurise.equals(identifiant);

	}
	public void retirer(double montant, String identifiant) {
        if (verifierIdentite(identifiant)) {
            super.retirer(montant);
        } 
}
	public void afficherSoldeSecurise(String identifiant)throws AccesInterditException{
		if(verifierIdentite(identifiant)) {
			afficherSolde();
		}else {
			throw new AccesInterditException("identifiant incorrect");
		}
	}
}
