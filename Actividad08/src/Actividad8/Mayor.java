package Actividad8;

import java.util.Scanner;

public class Mayor {
	public static void main(String[] args) {
		Scanner Mayor = new Scanner(System.in);
		System.out.println("Introdusca el valor del array");
		int arra = Mayor.nextInt();
		int val = 0;
		int[] Mayores = new int[arra];

		for (int i = val; i < arra; i++) {
			System.out.println("introduce los numeros");
			int num = Mayor.nextInt();
			if (val < num) {
				val = num;

			}

		}
		System.out.println(val);
	}

}
