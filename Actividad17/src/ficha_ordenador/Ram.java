package ficha_ordenador;

public class Ram {
	
	String capacidad;
	String marca;
	double precio;

	public Ram(String capacidad, String marca, double precio) {
		super();
		this.capacidad = capacidad;
		this.marca = marca;
		this.precio = precio;
	}

	double Precio() {
		return this.precio;
	}
	public String toString() {
		return " Memoria Ram:"+ " capacidad: "+ this.capacidad +" marca: "+ this.marca+" precio: "+ this.precio;
	}
}
