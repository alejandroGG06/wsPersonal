package _Act13;

import java.util.Arrays;

import javax.print.attribute.standard.Media;

public class Usuarios {

	int id;
	String nombre;
	int[] valoracion;

	public Usuarios() {
		super();
	}

	public Usuarios(int id, String nombre, int[] valoracion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.valoracion = valoracion;
	}

	public String Tostring() {
		return "usuario [ id = " + id + " nombre= " + nombre + " Valoracion= " + Arrays.toString(valoracion);
	}

	public void Mostrar() {
		System.out
				.println("usuario [ id = " + id + " nombre= " + nombre + " Valoracion= " + Arrays.toString(valoracion));
	}

	public void calcularValoracionMedia() {
		int media = (this.valoracion[0] + this.valoracion[1] + this.valoracion[2] + this.valoracion[3]) / valoracion.length;

		System.out.println("La media de las valoraciones es: " + media);
	}

	public void todas() {
		System.out.println("las valoraciones son: " + this.valoracion[0]+ "  "  + this.valoracion[1] +"  " + this.valoracion[2] );

	}

	public int conteos(int valoracion) {

		int count = 0;
		for (int val : this.valoracion) {
			if (val > valoracion) {
				count++;

			}

		}
		System.out.println("Lo superan " + count);
		return count;

	}

	public boolean mayorOno(int valor) {
		int media = (this.valoracion[0] + this.valoracion[1] + this.valoracion[2]) / valoracion.length;
		if (valor > media) {
			return true;
			
		} else {
			return false;

		}

	}

}
