package Actividad8;

import java.util.Iterator;
import java.util.Scanner;

public class Suma {
	public static void main(String[] args) {
		Scanner sum = new Scanner(System.in);
		System.out.println("Introdusca el tamaño para el array");
		int val = sum.nextInt();
		int res = 0;

		int[] array = new int[val];
		for (int i = res; i < val; i++) {
			System.out.println("Introduce los valores");
			int num = sum.nextInt();
			res += num;

		}
		System.out.println(res);

	}

}
