package Actividad09;

import java.util.Scanner;

public class MayusculasYMinusculas {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("introduce la cadena: ");
		String cadenas= sc.next();
		
		
		String cadenaMayusculas = cadenas.toUpperCase();
		System.out.println("La cadena es: ");
		System.out.println(cadenaMayusculas);
		
		String cadenaMinuscula= cadenas.toLowerCase();
		System.out.println("La cadena es: ");
		System.out.println(cadenaMinuscula);
		
		
		
	}
}
