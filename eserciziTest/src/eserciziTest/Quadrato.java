package eserciziTest;

public class Quadrato extends Rettangolo{
	
	public Quadrato (Punto P11, double lato){
		super (P11, lato, lato);
	}
	
	public double perimetro(){
		return 4*base;		
	}
	
	public double area(){
		return super.area();		
	}
}
