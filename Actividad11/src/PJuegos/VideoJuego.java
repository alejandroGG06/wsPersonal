package PJuegos;

import java.sql.Date;

public class VideoJuego {
	int id;
	String nombre;
	int puntuacion;
	double precio;
	Date fecha ;
	boolean segunda_mano;

	public VideoJuego() {
		
	this.fecha = new Date(01/01/1997);	
		
	}

	public VideoJuego(int id, String nombre, int puntuacion, double precio, Date fecha, boolean segunda_mano) {
		this.id = id;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
		this.fecha = fecha;
		this.segunda_mano = segunda_mano;
	}

	public VideoJuego(String nombre, Date fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public void DatosPorPantalla() {
		System.out.println("El ID es: " + id);
		System.out.println("El nombre de el juego es: " + nombre);
		System.out.println("La puntuacion del juego es: " + puntuacion);
		System.out.println("El precio del juego es: " + precio + "€");
		System.out.println("La fecha de creacion  del juego es: " + fecha);
		System.out.println("El juego es de segunda mano? " + segunda_mano);
	}

	public void NombreYpuntuacion() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("La puntuacion es: " + puntuacion);
	}

	public void PrecioLibras() {
		double libras = precio * 0.86;
		System.out.println("el precio en libras es: " + libras);
	}

	public void FechaEnFormato() {
		System.out.println("la fecha en el formato" + fecha);
	}

	public void Devolucion() {
		if (segunda_mano ) { 
			 System.out.println("el descuento es de:" + precio * 0.30);
		} else {
			System.out.println("el precio sin descuento es de: " +precio);
		}
	}

	public void Apto() {
		if (puntuacion >= 5) {
			System.out.println("EL juego es apto");
		} else {
			System.out.println("no es apto");
		}
	}

	public void Naturales() {
		for (int i = puntuacion; i <=10; i++) {
			System.out.println("los naturales son:" +i);
		}
	}
	public  void MasCaro () {
	if (this.precio>this.precio) {System.out.println("El juego 1 es mas caro");
	}
	else { System.out.println("el juego 2 es mas caro");
	}
	
	}
		
	
		
	}

