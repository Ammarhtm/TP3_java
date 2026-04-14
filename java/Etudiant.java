package Tp3.java;

public class Etudiant {
	String cne;
	float note;
	
	public Etudiant(String cne , float note) {
		this.cne =cne;
		this.note = note;
	}
	
	public String tostring() {
		return "Cne : "+cne + " la note : "+ String.valueOf(note) ;
	}
	
	public boolean estAdmis(Etudiant E) {
		if(E.note >=12) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Etudiant e1 = new Etudiant("Bh12434",12);
		System.out.println(e1.tostring());
		System.out.print(e1.estAdmis(e1));		
		
	}

}
