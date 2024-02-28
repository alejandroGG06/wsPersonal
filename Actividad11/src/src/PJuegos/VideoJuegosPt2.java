package src.PJuegos;

import java.util.Scanner;

public class VideoJuegosPt2 {

	public static void main(String[] args) {
	
		VideoJuego v1= new VideoJuego();
		Scanner sc=new Scanner(System.in);
		System.out.println("Introdusca el id: ");
		v1.id=sc.nextInt();
		System.out.println("Introdusca el nombre: ");
		v1.nombre=sc.next();
		System.out.println("Introdusca la puntuacion: ");
		v1.puntuacion=sc.nextInt();
		System.out.println("Introdusca el precio: ");
		v1.precio=sc.nextDouble();
		System.out.println("Es de segunda mano? ");
		v1.segunda_mano=sc.nextBoolean();
		
		v1.DatosPorPantalla();
		System.out.println("-----------------------------------");
		v1.NombreYpuntuacion();
		System.out.println("-----------------------------------");
		v1.PrecioLibras();
		System.out.println("-----------------------------------");
		v1.Devolucion();
		System.out.println("-----------------------------------");
		v1.Apto();
		System.out.println("-----------------------------------");
		v1.Naturales();
		System.out.println("-----------------------------------");
		
		
		VideoJuego v2= new VideoJuego();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Introdusca el id: ");
		v2.id=sc1.nextInt();
		System.out.println("Introdusca el nombre: ");
		v2.nombre=sc1.next();
		System.out.println("Introdusca la puntuacion: ");
		v2.puntuacion=sc1.nextInt();
		System.out.println("Introdusca el precio: ");
		v2.precio=sc1.nextDouble();
		System.out.println("Es de segunda mano? ");
		v2.segunda_mano=sc1.nextBoolean();
		
		v2.DatosPorPantalla();
		System.out.println("-----------------------------------");
		v2.NombreYpuntuacion();
		System.out.println("-----------------------------------");
		v2.PrecioLibras();
		System.out.println("-----------------------------------");
		v2.Devolucion();
		System.out.println("-----------------------------------");
		v2.Apto();
		System.out.println("-----------------------------------");
		v2.Naturales();
		System.out.println("-----------------------------------");
		v2.MasCaro();  
		System.out.println("-----------------------------------");
		
		VideoJuego v3= new VideoJuego();
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Introdusca el id: ");
		v3.id=sc1.nextInt();
		System.out.println("Introdusca el nombre: ");
		v3.nombre=sc1.next();
		System.out.println("Introdusca la puntuacion: ");
		v3.puntuacion=sc1.nextInt();
		System.out.println("Introdusca el precio: ");
		v3.precio=sc1.nextDouble();
		System.out.println("Es de segunda mano? ");
		v3.segunda_mano=sc1.nextBoolean();
		
		v3.DatosPorPantalla();
		System.out.println("-----------------------------------");
		v3.NombreYpuntuacion();
		System.out.println("-----------------------------------");
		v3.PrecioLibras();
		System.out.println("-----------------------------------");
		v3.Devolucion();
		System.out.println("-----------------------------------");
		v3.Apto();
		System.out.println("-----------------------------------");
		v3.Naturales();
		System.out.println("-----------------------------------");
		v3.MasCaro();  
		System.out.println("-----------------------------------");

	     
	

	}
}


