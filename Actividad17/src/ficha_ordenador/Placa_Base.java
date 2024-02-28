package ficha_ordenador;

public class Placa_Base {

	String marca;
	double precio;
	String factor;

	public Placa_Base(String marca, double precio, String factor) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.factor = factor;
	}

	public String toString() {
		return " placa base " + " marca: " + marca + " precio: " + precio + " factor: " + factor ;
	}

	public double costo() {
		return this.precio;
	}

}
