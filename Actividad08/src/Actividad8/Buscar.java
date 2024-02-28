package Actividad8;

import java.util.Scanner;

public class Buscar {
	public static void main(String[] args) {
		int[] array = new int[6];
		array[0] = 1;
		array[1] = 3;
		array[2] = 2;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		Scanner sc = new Scanner(System.in);
		System.out.println("Intenta adivinar los valores");
		for (int i = 0; i < array.length; i++) {

			array[i] = sc.nextInt();

			if (array[i] > array.length) {
				System.out.println("Este no es el valor ");
			} else {
				System.out.println("El numero es igual");

			}

		}

	}
}
