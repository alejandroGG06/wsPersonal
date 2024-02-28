package Actividad09;

import java.util.Scanner;

public class Contador {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese una cadena: ");
	        String cadena = scanner.nextLine();

	        System.out.print("Ingrese el carácter a contar: ");
	        char caracter = scanner.next().charAt(0);

	        int contador = 0;
	        for (int i = 0; i < cadena.length(); i++) {
	            if (cadena.charAt(i) == caracter) {
	                contador++;
	            }
	        }

	        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en la cadena.");
	    }

}
