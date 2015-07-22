package eserciziTest;

public class Rettangolo extends Figure {
	private Punto p1 = null;
	private Punto p2 = null;
	protected double altezza, base;

	public Rettangolo(Punto P11, double h, double b) {
altezza= h;
base=b;
this.p1=P11;
	}

	public Rettangolo(Punto P11, Punto P22) {
		this(P11, (P22.getX() - P11.getX()), (P22.getY() - P11.getY()));
	}

	public Rettangolo() {
		this(null, 2, 3);
	}

	double perimetro() {
		return 2 * (base + altezza);
	}

	double area() {
		return base * altezza;
	}

}
