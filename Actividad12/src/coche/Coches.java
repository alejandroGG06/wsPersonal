package coche;

import java.util.Iterator;

public class Coches {
	int id;
	String marca;
	String modelo;
	double precio;
	String fecha_matricula;
	int kilometros;

	public Coches() {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public Coches(int id, String marca, String modelo, double precio, int kilometros, String fecha_matricula) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.fecha_matricula = fecha_matricula;
		this.kilometros = kilometros;
	}

	public String toString() {
		return "coche [ id= " + id + " marca= " + marca + " modelo= " + modelo + " precio= " + precio
				+ " fecha de matriculacion= " + fecha_matricula + " kilometros" + kilometros;

	}

	public void MostrarToString() {
		System.out.println("coche [ id=" + id + " marca=" + marca + " modelo= " + modelo + " precio= " + precio
				+ " fecha de matriculacion= " + fecha_matricula + " kilometros " + kilometros);
	}

	public void precio() {
		System.out.println("el precio base es: " + this.precio + "€");

	}

	public void matriculacion() {
		String matriculacion = this.fecha_matricula.substring(6, this.fecha_matricula.length());
		System.out.println("el año de matriculacion es: " + matriculacion);
	}

	public void biciesto() {
		String matriculacion = this.fecha_matricula.substring(6, this.fecha_matricula.length());
		int anioEntero = Integer.parseInt(matriculacion);

		if (anioEntero % 4 == 0 && anioEntero % 100 != 0 || (anioEntero % 100 == 0 && anioEntero % 400 == 0)) {
		}
		System.out.println("el año " + anioEntero + " es biciesto");
	}

	public void kilometros() {
		double descuento = this.kilometros;

		

		if (this.kilometros > 10000 && this.kilometros < 50000) {

			descuento = (this.kilometros * 80) / 100;
			System.out.println("se devuelven " + descuento);
		} else if (this.kilometros > 50000) {
			descuento = (this.kilometros * 50) / 100;

			System.out.println("el monto a devolver es del 50% " + descuento);
		}
		else {System.out.println("es lo mismo");
			
		}
	}

	public void primos() {

		double primos = this.kilometros;
		for (int i = 0; i < primos; i++) {
			if (primos % i == 0) {
				System.out.println("Es primo");
				break;
			}
		}
	}

	public void Lefalta() {

		int kl = 0;
		for (int i = this.kilometros; i < 200000; i++) {

			kl++;
		}
		System.out.println("le faltan " + kl);
	}

	public void marcaYmodelo() {
		marca.length();
		modelo.length();
		System.out.println("el tamaño de la marca es: " + marca.length()+" el tamaño del modelo es: " + modelo.length());

		
	}
	
	public void diferencia(Coches coches) {
		
		int kl2 =coches.kilometros -this.kilometros;
		
		System.out.println("la diferencia es: " +  kl2 );
		
	}

	public void MasCaro( Coches coches) {
		if (this.precio > this.precio) {
			System.out.println("El primer coche es mas caro");
		} else {
			System.out.println("el segundo coche es mas caro");
		}

	}

	
		
	
}