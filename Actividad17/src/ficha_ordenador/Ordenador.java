package ficha_ordenador;

import java.util.ArrayList;


public class Ordenador {

	double precio;
	TarjetaGrafica tarjetaGrafica;
	Placa_Base placa_Base;
	ArrayList<Ram> listaRam;
	procesador procesador;
	ArrayList<Perifericos> listaperPerifericos;
	
	
	
	
	

	public Ordenador() {
		super();
	}



	public Ordenador(double precio, TarjetaGrafica tarjetaGrafica, Placa_Base placa_Base, ArrayList<Ram> listaRam,
			procesador procesador, ArrayList<Perifericos> listaperPerifericos) {
		super();
		this.precio = precio;
		this.tarjetaGrafica = tarjetaGrafica;
		this.placa_Base = placa_Base;
		this.listaRam = listaRam;
		this.procesador = procesador;
		this.listaperPerifericos = listaperPerifericos;
	}

	public String toString() {
		return "Componentes del ordenador: "+  this.procesador+ this.placa_Base
		+ this.tarjetaGrafica+ this.listaRam + this.listaperPerifericos;
	}



	public void precioTotal() {
		
	this.precio= procesador.precio +  placa_Base.precio + tarjetaGrafica.precio;
	
	for (Ram ram : listaRam) {
		this.precio+=ram.precio;
		
	}
	for (Perifericos perifericos : listaperPerifericos) {
		this.precio+= perifericos.precio;
		
		
		
	}
	System.out.println("el precio de los componentes es:"+ this.precio);

	}
	
	
}
