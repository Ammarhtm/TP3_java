package Tp3.java;

import java.util.Scanner;

public class Produits {
	private int id;
	private String nom;
	private String description;
	private float prix;
	private int quantite;
	
	
	
	public Produits(int id , String nom ,String description, float prix , int quantite) {
		this.description = description;
		this.id = id ;
		this.nom = nom ;
		this.prix= prix;
		this.quantite= quantite;
	}
	
	public static Produits ajouterProd() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("entrer id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("entrer nom: ");
		String nom = sc.nextLine();
		System.out.print("entrer description: ");
		String descp = sc.nextLine();
		System.out.print("entrer prix: ");
		float prix = sc.nextFloat();
		System.out.print("entrer quantite: ");
		int quantite = sc.nextInt();

		return  new Produits(id,nom,descp,prix,quantite);
		
		
	}
	public void afficher() {
        System.out.println("Produit [ID=" + id + ", Nom=" + nom + ", Prix=" + prix + " DH" +" ,Quantite : "+ quantite+ "]");
    }
	
	public void modifierProd() { 
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Que voulez-vous modifier ? (1:ID, 2:Nom, 3:Description, 4:Prix, 5:Quantité)");
	    int choix = sc.nextInt();
	    sc.nextLine(); 
	    switch(choix) {
	        case 1:
	            System.out.print("Entrer nouveau ID: ");
	            this.id = sc.nextInt();
	            break;
	        case 2:
	            System.out.print("Entrer nouveau Nom: ");
	            this.nom = sc.nextLine();
	            break;
	        case 3:
	            System.out.print("Entrer nouvelle Description: ");
	            this.description = sc.nextLine();
	            break;
	        case 4:
	            System.out.print("Entrer nouveau Prix: ");
	            this.prix = sc.nextFloat();
	            break;
	        case 5:
	            System.out.print("Entrer nouvelle Quantité: ");
	            this.quantite = sc.nextInt();
	            break;
	        default:
	            System.out.println("Erreur: Entrez un nombre entre 1 et 5");
	            break;
	    }
	    System.out.println("Modification terminée !");
	}
	
	public void supprimerProd() {
		this.id = 0;
        this.nom = "";
        this.description = "";
        this.prix = 0.0f;
        this.quantite = 0;
        System.out.println("Le produit a été réinitialisé (effacé).");
	}
	
	public Produits getProduitByID() {
		Scanner sc = new Scanner(System.in);
		System.out.print("entrer id: ");
		int id = sc.nextInt();
		
		if(id == this.id) {
			return this;
		}
		else {
			System.out.println("ID ne correspond pas !");
	        return null;
		}
		
	}
	
	
	public static void main(String[] args) {
		Produits p = Produits.ajouterProd();
		p.afficher();
		p.modifierProd();
		p.afficher();
        Produits p2 = p.getProduitByID();
        
        if (p2 != null) {
            System.out.println("Produit trouvé :");
            p2.afficher();
        } else {
            System.out.println("Aucun produit trouvé avec cet ID.");
        }
	}
	
}
