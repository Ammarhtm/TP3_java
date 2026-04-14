package Tp3.java;

public class Voitures {
	String marque;
	float vitesse;
	
	public Voitures(String marque,float vitesse) {
		this.marque = marque;
		this.vitesse = vitesse;
	}

	public void accelerer(int augmentation) {
        this.vitesse = this.vitesse + augmentation;

        if (this.vitesse > 240) {
            this.vitesse = 240;
            System.out.println("Vitesse maximale atteinte : 240 km/h");
        } else {
            System.out.println("La nouvelle vitesse de la " + marque + " est : " + this.vitesse + " km/h");
        }
    }
	
	public void freiner(int dimin) {
        this.vitesse = this.vitesse - dimin;

        if (this.vitesse <0 ) {
        	this.vitesse =0;
            System.out.println("La voiture est arrêtée (0 km/h).");
        } else {
            System.out.println("Freinage... La vitesse est maintenant : " + this.vitesse + " km/h");
        }
    }
	
	public static void main(String[] args) {
		Voitures v1= new Voitures("BMW",200);
		v1.accelerer(20);
		v1.freiner(40);
	}

}
