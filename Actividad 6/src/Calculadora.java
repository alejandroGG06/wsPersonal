import java.util.Scanner;

public class Calculadora {
	public static void suma(int numero01, int numero02) {
		int suma = numero01 + numero02;
		System.out.println("Suma1 " + suma);
	}

	public static void suma(double numero01, double numero02) {
		double suma = numero01 + numero02;
		System.out.println("Suma2 " + suma);
	}

	// ---------------------------------------------------------
	public static void resta(int numero01, int numero02) {
		int resta = numero01 - numero02;
		System.out.println("Resta1 " + resta);
	}

	public static void resta(float numero01, float numero02) {
		float resta = numero01 - numero02;
		System.out.println("Resta2 " + resta);
	}

	// ----------------------------------------------------------
	public static void multiplicacion(int numero01, int numero02) {
		int Multi = numero01 * numero02;
		System.out.println("Multiplicacion1 " + Multi);
	}

	public static void multiplicacion(long numero01, long numero02) {
		long Multi = numero01 * numero02;
		System.out.println("Multiplicacion2 " + Multi);
	}

	// ----------------------------------------------------------
	public static void divicion(int numero01, int numero02) {
		int Div = numero01 / numero02;
		System.out.println("Divicion1 " + Div);
	}

	public static void divicion(long numero01, long numero02) {
		long Div = numero01 / numero02;
		System.out.println("Divicion2 " + Div);
	}

	// Ejercicio3
	public static void Totales() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ingresa el primer numero ");
		int numero1 = scanner.nextInt();

		System.out.print("ingrese el segundo numero ");
		int numero2 = scanner.nextInt();
		suma(numero1, numero2);
		resta(numero1, numero2);
		multiplicacion(numero1, numero2);
		divicion(numero1, numero2);

	}

	public static void main(String[] args) {
		suma(10, 9);
		suma(11.23,
				22.1);
		resta(9, 2);
		resta(7F, 6F);
		multiplicacion(10, 5);
		multiplicacion(30L, 10L);
		divicion(19, 10);
		divicion(23L, 2L);
		Totales();

	}

}
