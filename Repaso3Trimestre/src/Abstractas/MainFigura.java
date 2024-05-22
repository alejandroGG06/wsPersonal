package Abstractas;

import java.util.ArrayList;
import java.util.List;

public class MainFigura {

	public static void main(String[] args) {
		Figura f1= new Circulo(34.33);
		Figura f2 = new Cuadrado(12);
		
		List<Figura>figuras= new ArrayList<Figura>();
		
		figuras.add(f1);
		figuras.add(f2);
	for (Figura figura : figuras) {
		System.out.println(figura.toString());
		System.out.println();
		System.out.println("area de las figuras: " +figura.Area());
		System.out.println();
		System.out.println("perimetro de las figuras: "+ figura.perimetro());
	}
	}

}
