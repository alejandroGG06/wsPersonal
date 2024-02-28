package Actividad09;

import java.util.Scanner;


public class Longitud {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Ingrese una cadena: ");
	        String cadena = scanner.nextLine();
	        
	        System.out.println("la cadena es: " +cadena);
	        System.out.println("La longitud de la cadena ingresada es: " + cadena.length());
		
	}
}
