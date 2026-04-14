package Tp3.java;

public class Point {
	private double x;
	private double y;
	
	public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
	public void afficherPoint() {
		System.out.println("X : "+this.x+" Y : "+this.y);
	}
	public Point deplacerPoint(double dx , double dy) {
		this.x = this.x+dx;
		this.y = this.y+dy;
		
		return this;
	}
	
	public double calculedist() {
	return Math.sqrt(this.x*this.x + this.y*this.y);
		
	}
	
	public double calculdistbeetwpoint(Point B) {
		double a ,b ;
		a = this.x - B.x;
		b = this.y - B.y;
		return Math.sqrt(a*a + b*b);
		
		
	}
	
	public static void main(String[] args) {
	        Point p1 = new Point(10, 20);
	        Point p2 = new Point(4,2);
	        p1.deplacerPoint(5, 5);
	        p1.afficherPoint();
	        System.out.printf("la distance est : %.2f\n",p1.calculedist());
	        System.out.printf("la distance entre p1 et p2 est: %.2f",p1.calculdistbeetwpoint(p2));
	    }
	}

    