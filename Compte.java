package tp_genericite;

public class Compte<T> {
	private int numeroCompte;
	private double solde;
	private T devise;
	public Compte(int numeroCompte,double solde,T devise) {
		this.numeroCompte=numeroCompte;
		this.solde=solde;
		this.devise=devise;
	}
	public int getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public T getDevise() {
		return devise;
	}
	public void setDevise(T devise) {
		this.devise = devise;
	}
	public void deposer(double montant) {
		if(montant>0) {
			solde=solde+montant;
		}
	}
	public void retirer(double montant) {
		if(montant>0 && montant<=solde) {
			solde=solde-montant;
		}
	}
	public void afficherSolde(){
		System.out.println("le solde est: "+solde+" "+devise);
	}
	public static <T> void transferer(Compte <T> source,Compte <T> destination, double montant) {
		if(montant>0 && source.getSolde()>=montant) {
			source.retirer(montant);
			destination.deposer(montant);
		}
		
	}

}
