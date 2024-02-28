package Actividad8;

import java.util.Scanner;

public class Promedio {
	public static void main(String[] args) {
		Scanner prom = new Scanner(System.in);
		System.out.println("Introdusca el tamaño para el array");
		int promed = prom.nextInt();
		double resul = 0;
		double fin = 0;

		double[] arrayprom = new double[promed];

		for (double i = resul; i < promed; i++) {
			System.out.println("Introduce los valores");
			double num = prom.nextDouble();

			resul += num;
			fin = resul / promed;

		}
		System.out.println("La suma de las notas es: " + resul);
		System.out.println("El promedio es: " + fin);
	}
}