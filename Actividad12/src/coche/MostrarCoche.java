package coche;

public class MostrarCoche {

	public static void main(String[] args) {
		Coches c1 = new Coches(2, "ford", "mustang", 1200, 20000, "12/25/2022");

		c1.MostrarToString();
		System.out.println("--------------------------------------------------");
		c1.precio();
		System.out.println("--------------------------------------------------");
		c1.matriculacion();
		System.out.println("--------------------------------------------------");
		c1.biciesto();
		System.out.println("--------------------------------------------------");
		c1.kilometros();
		System.out.println("--------------------------------------------------");
		c1.primos();
		System.out.println("-----------------------------------------------");

		Coches c2 = new Coches(4, "Mercedes", "a4", 35000, 5000, "12/5/2024");
		c2.MostrarToString();
		System.out.println("--------------------------------------------------");
		c2.Lefalta();
		System.out.println("--------------------------------------------------");
		c2.MasCaro( c1);
		System.out.println("--------------------------------------------------");
		c2.marcaYmodelo();
		System.out.println("--------------------------------------------------");
		c2.diferencia(c1);
		
		
	}

}
