package Interfaces;

class Coche implements Vehiculo {
	
	String marca;
	String modelo;
	int año;
	

	public Coche(String marca, String modelo, int año) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		
		
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", año=" + año + "]";
	}

	@Override
	public void encender() { System.out.println(marca+" "+modelo+" Esta encendido");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		
	}

}
