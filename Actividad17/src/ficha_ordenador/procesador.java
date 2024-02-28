package ficha_ordenador;

public class procesador {
	
	 String marca;
	 String modelo;
	 int nucleos;
	 double precio;
	 
	 
	public procesador(String marca, String modelo, int nucleos, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nucleos = nucleos;
		this.precio = precio;
	}
	 public String toString() {
		 return "procesador:"+" marca: "+this.marca+" modelo: "+ this.modelo+" nucleos: "+this.nucleos+ " precio: "+ this.precio;
	 }
	
	 public double Precio() {
		 return this.precio;
	 }
}
