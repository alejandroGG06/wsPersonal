package Actividad8;

import java.util.Scanner;

public class UnirArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int suma=0;
		 int i;
		System.out.println("introduce el valor para el primer array");
		int arr1 = sc.nextInt();
		System.out.println("introduce el valor para el segundo array");
		int arr2 = sc.nextInt();
		
		int[] array1 = new int[arr1];
		
		int[] array2 = new int[arr2];
		
		int total = array1.length + array2.length;
		
		int[] array3 = new int[total];

		;
		System.out.println("introduce los numeros de las posiciones del primero");
		for ( i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}

		System.out.println("introduce los numeros de las posiciones del segundo");
		for ( i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
			
		}
		
		 suma= total+total;
		 System.out.println(suma);
	}

}
