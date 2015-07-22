package eserciziTest;
import java.io.IOException;
import java.io.InputStreamReader;


public class mainClass {

	public static void main(String[] args) {
		
		Punto p1, p2;
		p1= new Punto(1,4);
		p2= new Punto(4,6);
//		p2.setY(900);
		
		System.out.println("sei sul quadrante "+p1.localizzaquadrante());
		
		
		Segmento s1;
		s1= new Segmento(p1,p2);
		
		Rettangolo r1;
		r1=new Rettangolo(p1,p2);
		
		System.out.println("la lunghezza del segmento è: "+s1.lunghezza());
		System.out.println("il perimetro del rettangolo è "+r1.perimetro());
		System.out.println("L'area del rettangolo è "+r1.area());
        
		Quadrato q1;
		q1= new Quadrato(p1,3);
		System.out.println("il perimetro del rettangolo è "+q1.perimetro());
		System.out.println("L'area del rettangolo è "+q1.area());
		
		Figure[] Disegno= new Figure[1000];
		Disegno[0]=new Quadrato(new Punto(1,4),3);
		Disegno[1]=new Rettangolo(new Punto(1,3),new Punto(3,4));
		
	}

}
