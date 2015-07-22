package eserciziTest;


import java.awt.Color;

enum tipiTratto {fine, medio,normale,forte};


public abstract class Figure {
	
	Color penna = Color.black;
	tipiTratto spessore = tipiTratto.normale;
	
	public Figure(){
		//potenziali importanti azioni di inizializzazione
		//...
	}
	
//	 double Perimetro() { return 0;}
	abstract double perimetro();               //basta che un solo metodo sia astratto affinche anche la classe debba essere astratta
                                               //Abstract della classe madre stabilisce solo un modello per le classi figlie . In questo caso il modello
	                                           //� che le classi figlie abbiano tutte un metodo Perimetro(), perfino il Punto
	public Figure(Color c, tipiTratto tratto){
		this();
		penna = c; spessore=tratto;
		
	}

}
