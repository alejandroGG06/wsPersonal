package Actividad8;


import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class ParesInpares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int impa=0;
		int pares=0;
		System.out.println("Tamaño del array");
		int val = sc.nextInt();
		int num;
		
		int[] array= new int[val];
		
		for (int i = 0; i < val; i++) {
			System.out.println("Introduce los numeros para las posiciones: " +i );	
			array[i]= sc.nextInt();
			
		if (array[i]%2==0) {pares++;
		
		}else {impa++;
			
		}
		
		}
			
		
		System.out.println("total de pares " +pares);
		System.out.println("Total de impares "+impa);
		
	}

}
