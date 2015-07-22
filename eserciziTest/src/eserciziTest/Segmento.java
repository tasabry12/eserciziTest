package eserciziTest;

public class Segmento {
	private Punto P1 = null;
	private Punto P2 = null;

	public Punto getP1() {
		return P1;
	}

	public void setP1(Punto p1) {
		P1 = p1;
	}

	public Punto getP2() {
		return P2;
	}

	public void setP2(Punto p2) {
		P2 = p2;
	}

	public Segmento(Punto P11, Punto P22) {
		this.P1 = P11;
		this.P2 = P22;
	}

	public Segmento(Punto P22) {
		this(null, P22);
	}

	public Segmento() {
		this(null, null);
	}
	
	public double lunghezza(){
	
				
				return Math.sqrt(Math.pow(P2.getX()-P1.getX(), 2)+
				         Math.pow(P2.getY()-P1.getY(), 2) );
	}

}
