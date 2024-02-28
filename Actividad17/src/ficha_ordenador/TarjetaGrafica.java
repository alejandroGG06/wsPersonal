package ficha_ordenador;

public class TarjetaGrafica {

	String marca;
	String modelo;
	int CUDA;
	double precio;
	String ram;
	
	
	public TarjetaGrafica(String marca, String modelo, int CUDA, double precio, String ram) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.CUDA =CUDA;
		this.precio = precio;
		this.ram = ram;
	}
	
	public String toString() {
		return" Tarjeta Grafica: "+" marca: "+ this.marca+" modelo: "+this.modelo+" CUDA: "+this.CUDA+" precio: "
		+this.precio+" ram: "+this.ram;
	}
	public double Precio() {
		return this.precio;
	}
}
