

public class Actividad05 {
// Ejerciocio1
	public static void menu() {
		System.out.println("Entrar a la aplicacion");
		System.out.println("---------------------------------------------");
		System.out.println("Registrarse en la aplicacion");
		System.out.println("---------------------------------------------");
		System.out.println("Salir del programa");
		System.out.println("---------------------------------------------");
	}

// Ejercicio2
	public static void PerimetroRectangulo(int base, int alto) {
		int perimetro = base * 2 + alto * 2;
		System.out.println("la base es " + perimetro);

	}

//Ejercicio3
	public static int PerimetroRectangulo2(int base2, int alto2) {
		int Perimetro = base2 * 2 + alto2 * 2;
		return Perimetro;
	}

//Ejercicio4
	public static double AreaRectangulo(double Base, double Altura) {
		double Area = Base * Altura;
		return Area;

	}

//Ejercicio5
	public static double Hipotenusa(double Cateto1, double Cateto2) {
		double Hipo = Cateto1 * 2 + Cateto2 * 2;
		return Hipo;
	}

//Ejercicio 6
	public static int Suma(int numero1, int numero2) {
		int Suma = numero1 + numero2;
		return Suma;
	}

	public static int Resta(int resta1, int resta2) {
		int Restar = resta1 - resta2;
		return Restar;
	}

	public static double Divicion(double Div1, double Div2) {
		double Diviciones = Div1 / Div2;
		return Diviciones;
	}

	public static long Multiplicacion(long Multi1, long Multi2) {
		long Multiplicaciones = Multi1 * Multi2;
		return Multiplicaciones;
	}

//Ejercicio 7
	public static void Media(double Media1, double Media2, double Media3) {
		double Medias = Media1 + Media2 + Media3 / 3;
		System.out.println("La media de las notas es: " + Medias);
	}

//Ejercicio 8 
	public static void Nota(double nota1, double nota2, double nota3, double nota4, double nota5) {
		double Medias = nota1 + nota2 + nota3 / 0.55;
		double Examen = nota4 / 0.30;
		double Trabajo = nota5 / 0.15;
		double NotaFinal = Medias + Examen + Trabajo;
		System.out.println("La media de las notas es: " + NotaFinal);
	}
//Ejercicio 9	
		public static void Salario(double Sueldo, double Horas ) {
			double Salario= Sueldo;
			double HorasExtras = Horas*10;
			Double SueldoFinal = Salario+HorasExtras;
			System.out.println("La media de las notas es: " + SueldoFinal);

	}

	public static void main(String[] args) {
		// ejercicio 1 -------------------------------------------------------------
		menu();
		menu();
		menu();
		// ejercicio 2 -------------------------------------------------------------
		PerimetroRectangulo(5, 8);
		PerimetroRectangulo(10, 30);

		// ejercicio 3 -------------------------------------------------------------
		int PerimetroFinal = PerimetroRectangulo2(10, 8);
		System.out.println("el perimetro final es " + PerimetroFinal);
		int PerimetroFinal1 = PerimetroRectangulo2(5, 40);
		System.out.println("el final es: " + PerimetroFinal1);

		// ejercicio 4 -------------------------------------------------------------
		double AreaFinal = AreaRectangulo(11.8, 5.2);
		System.out.println("El area final es " + AreaFinal);
		double AreaFinal2 = AreaRectangulo(5.33, 3.33);
		System.out.println("El area final es " + AreaFinal2);
		// ejercicio 5 -------------------------------------------------------------
		double Hipo1 = Hipotenusa(23.8, 22);
		System.out.println("La hipotenusa es: " + Hipo1);
		double Hipo2 = Hipotenusa(10, 34);
		System.out.println("La hipotenusa es " + Hipo2);
		// ejercicio 6 -------------------------------------------------------------
		int Suma1 = Suma(2, 5);
		System.out.println("La suma es: " + Suma1);
		int Suma2 = Suma(3, 7);
		System.out.println("LA suma es: " + Suma2);
		// ejercicio 6 --------------------------------------------------------------
		int Resta1 = Resta(9, 2);
		System.out.println("La resta de los valores es: " + Resta1);
		int Resta2 = Resta(10, 5);
		System.out.println("La resta de los valores es: " + Resta2);
		// ejercicio6 --------------------------------------------------------------
		double Divicion1 = Divicion(15.2, 5.2);
		System.out.println("La divicion de los numeros es: " + Divicion1);
		double Divicion2 = Divicion(10, 2);
		System.out.println("La divicion de los numeros es: " + Divicion2);
		// ejercicio 6 --------------------------------------------------------------
		long Multiplcicaicon1 = Multiplicacion(8, 12);
		System.out.println("La multiplicacion es: " + Multiplcicaicon1);
		long Multiplicacion2 = Multiplicacion(45, 8);
		System.out.println("La multiplicacion es: " + Multiplicacion2);
		// ejercicio 7 --------------------------------------------------------------
		Media(8, 9, 3.3);
		Media(8.9, 4.5, 10);
		// ejercicio 8
		// --------------------------------------------------------------------------
		Nota(8, 9, 5, 6, 4);
		// ejercicio 9 --------------------------------------------------------------
		Salario(1200,16);
		
	}

}