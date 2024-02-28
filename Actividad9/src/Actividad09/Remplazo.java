package Actividad09;

import java.util.Scanner;

public class Remplazo {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa una cadena: ");
	        String cadena = scanner.nextLine();

	        System.out.print("Ingresa el carácter a reemplazar: ");
	        char caracterOriginal = scanner.next().charAt(0);

	        System.out.print("Ingresa el carácter de reemplazo: ");
	        char caracterReemplazo = scanner.next().charAt(0);

	        String nuevaCadena = cadena.replace(caracterOriginal, caracterReemplazo);

	        System.out.println("La cadena resultante es: " + nuevaCadena);
	    }
	}

