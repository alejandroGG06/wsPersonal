
public class FigurasGeometricas {

	public static void Area(int alto, int base) {
		int AreaCuadrado = alto * base;
		System.out.println("el area del cuadrado es: " + AreaCuadrado);
	}

	// ------------------------------------------------
	public static void Areas(double base, double alto) {
		double AreaTriangulo = base * alto / 2;
		System.out.println("el area de un triangulo es: " + AreaTriangulo);
	}

	// ------------------------------------------------
	public static void Areas(float pi, float radio) {
		float AreaCirculo = pi * radio * radio;
		System.out.println("el area de un circulo es: " + AreaCirculo);
	}

	// ------------------------------------------------
	public static void main(String[] args) {
		Areas(12, 12);
		Areas(15.2, 11.5);
		Areas(3.14F, 8F);
	}

}
