import java.util.Arrays;
import java.util.Scanner;

public class Duplicados {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el tamaño del array: ");
		int tamano = scanner.nextInt();

		int[] numeros = new int[tamano];

		for (int i = 0; i < tamano; i++) {
			System.out.print("Ingrese el número en la posición " + (i) + ": ");
			numeros[i] = scanner.nextInt();
		}

		int[] arraySinDuplicados = eliminarDuplicados(numeros);

		System.out.print("Nuevo array sin duplicados: ");
		for (int num : arraySinDuplicados) {
			System.out.print(num + " ");
		}
	}

	public static int[] eliminarDuplicados(int[] array) {
		int[] arraySinDuplicados = Arrays.stream(array).distinct().toArray();
		return arraySinDuplicados;
	}
}
