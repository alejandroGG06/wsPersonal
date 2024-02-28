package Actividad8;

import java.util.Scanner;

public class Multiplicar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño ");
		int arra = sc.nextInt();
		int mult = 1;
		int[] array = new int[arra];
		System.out.println("Introduce los valores");
		for (int i = 0; i < arra; i++) {
			array[i] = sc.nextInt();
			
			mult*= array[i];
		}
		
			
			
		
		System.out.println("el total es: " +mult);
		}
		
	}

