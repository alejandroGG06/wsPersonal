package ficha_ordenador;

public class Perifericos {

	String tipo;
	String marca;
	double precio;

	public Perifericos(String tipo, String marca, double precio) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.precio = precio;
	}

	public double costo() {
		return this.precio;
	}
	public String toString() {
		return "perifericos " +" tipo :"+this.tipo+" marca: "+this.marca+ " precio: " + this.precio;
	
		
		
	}

}
