package Actividad8;

import java.util.Scanner;

public class Invertir {
	public static void main(String[] args) {
		Scanner inv = new Scanner(System.in);
		System.out.println("introduce el tamaño del array");
		int tam = inv.nextInt();

		int[] array = new int[tam];

		System.out.println("introduce los numeros 1 a 1 ");
		for (int i = 0; i < array.length; i++) {

			array[i] = inv.nextInt();

		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);

		}

	}
}
