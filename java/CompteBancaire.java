package Tp3.java;

public class CompteBancaire {
	private int numero;
	private double solde;
	
	// Constructeur
    public CompteBancaire(int numero, double soldeInitial) {
        this.numero = numero;
        this.solde = soldeInitial;
    }
	
    public void deposer(double montant) {
        if (montant > 0) {
            this.solde += montant;
            System.out.println("Dépot de " + montant + " effectué avec succès.");
        } else {
            System.out.println("Le montant doit être positif !");
        }
    }
	
    public void retirer(double montant) {
        if (montant > 0 && montant <= this.solde) {
            this.solde -= montant;
            System.out.println("Retrait de " + montant + " effectué avec succès.");
        } else {
            System.out.println("Solde insuffisant ou montant invalide !");
        }
    }

    
    public void transferer(double montant, CompteBancaire destination) {
        if (montant > 0 && montant <= this.solde) {
            this.solde -= montant;        
            destination.deposer(montant);     
            System.out.println("Transfert de " + montant + " vers compte n°" + destination.numero + " réussi.");
        } else {
            System.out.println("Transfert impossible : Solde insuffisant.");
        }
    }
	
	public double afficherSolde() {
		return this.solde;
	}
	
	
	public static void main(String[] args) {
		CompteBancaire c1 = new CompteBancaire(101, 5000);
		CompteBancaire c2 = new CompteBancaire(102, 1000);
		System.out.println(c2.afficherSolde());
		System.out.println(c1.afficherSolde());
		
		c1.transferer(100, c2);
		System.out.println(c2.afficherSolde());
		System.out.println(c1.afficherSolde());
	}

}
