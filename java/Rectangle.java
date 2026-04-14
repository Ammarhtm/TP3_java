package Tp3.java;

public class Rectangle {
	double largeur;
	double hauteur;
	
	public Rectangle(double largeur , double hauteur) {
		this.largeur= largeur;
		this.hauteur = hauteur;
	}
	
	public double surf(Rectangle R) {
		return R.largeur*R.hauteur;
	}
	
	public static double perim(Rectangle R) {
		return 2*(R.largeur+R.hauteur);
	}
	
	
	
	public static void main(String[] args) {
	     Rectangle R1 = new Rectangle(5,9);
	     System.out.println("la surface est : " +R1.surf(R1));
	     System.out.println("la perimetre est :" + perim(R1));
	}

}
