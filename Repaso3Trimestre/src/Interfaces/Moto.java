package Interfaces;

public class Moto implements Vehiculo {
	Tipo tipo;	

	@Override
	public void encender() {
		System.out.println(tipo.cruiser+" motoencendida");
		
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
