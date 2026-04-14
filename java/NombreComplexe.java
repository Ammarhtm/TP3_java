package Tp3.java;

public class NombreComplexe {
	private double reel;
	private double imaginaire;
	public NombreComplexe() {}
	
	public NombreComplexe(double reel,double imaginaire) {
		this.reel=reel;
		this.imaginaire =imaginaire;
	}
	
	public  static NombreComplexe addition(NombreComplexe c1 , NombreComplexe c2) {
		NombreComplexe c3 = new NombreComplexe() ;
		
		c3.reel = c1.reel + c2.reel;
		c3.imaginaire = c1.imaginaire + c2.imaginaire;
		
		return c3;
	}
	
	public static void addition2(NombreComplexe c1 , NombreComplexe c2) {
		NombreComplexe c3 = new NombreComplexe() ;
		
		c3.reel = c1.reel + c2.reel;
		c3.imaginaire = c1.imaginaire + c2.imaginaire;
		System.out.println("la somme de nombre complexe Z1 et Z2 est : "+c3.reel + "+" + c3.imaginaire+"i");	
	}
	
	/*public NombreComplexe addition3(NombreComplexe c1) {
		double r= this.reel + c1.reel;
		double i =this.imaginaire + c1.imaginaire;
		
		return new NombreComplexe(r, i);
	}*/
	public NombreComplexe addition3(NombreComplexe c1) {

	    double r = this.reel + c1.reel;
	    double i = this.imaginaire + c1.imaginaire;

	    NombreComplexe resultat = new NombreComplexe(r, i);

	    return resultat;
	}
	
	
	public static void multiplication(NombreComplexe c1 , NombreComplexe c2) {
		NombreComplexe c3 = new NombreComplexe() ;
		
		c3.reel = c1.reel*c2.reel - c1.imaginaire*c2.imaginaire;
		c3.imaginaire = c1.imaginaire*c2.reel + c2.imaginaire*c1.reel;
		System.out.println("la multiplication de nombre complexe Z1 et Z2 est : "+c3.reel + "+" + c3.imaginaire+"i");	
	}

	
    public void afficher() {
        if (this.imaginaire >= 0) {
            System.out.println(this.reel + " + " + this.imaginaire + "i");
        } else {
            System.out.println(this.reel + " - " + Math.abs(this.imaginaire) + "i");
        }
    }
	
	
	
	public static void main(String[] args) {
		NombreComplexe c1= new NombreComplexe(1,2) ;
		NombreComplexe c2 = new NombreComplexe(0,4);
		NombreComplexe somme = new NombreComplexe();
		//somme=addition(c1,c2);
		c1.afficher();
		c2.afficher();
		somme =c1.addition3(c2);
		
		System.out.print("la somme est : ");
		somme.afficher();
		multiplication(c1,c2);
		//addition2(c1,c2);
	}
	
}
