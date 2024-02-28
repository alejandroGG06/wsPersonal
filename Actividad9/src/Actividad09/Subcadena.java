package Actividad09;

import java.util.Scanner;

public class Subcadena {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese una cadena: ");
		String cadena = scanner.nextLine();

		System.out.print("Ingrese el primer índice: ");
		int indice1 = scanner.nextInt();

		System.out.print("Ingrese el segundo índice: ");
		int indice2 = scanner.nextInt();

		if (indice1 < 0 || indice2 >= cadena.length() || indice1 > indice2) {
			System.out.println("Índices no válidos. Asegúrese de que sean válidos y en orden.");
		} else {

			String subcadena = cadena.substring(indice1, indice2);

			System.out.println("La subcadena entre los índices " + indice1 + " y " + indice2 + " es: " + subcadena);
		}
	}
}
