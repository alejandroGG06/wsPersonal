package ficha_ordenador;

import java.util.ArrayList;

public class Main_Ordenador {

	public static void main(String[] args) {
		
		
		Ordenador miordenador = new Ordenador();
		
		miordenador.procesador= new procesador("AMD","Ryzen9" ,12, 600);
		miordenador.placa_Base= new Placa_Base("MSI", 149.90, "ATX");
		
		miordenador.listaRam = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			
				miordenador.listaRam.add(new Ram("coursair", "8GB", 66.50));
			}
			Ram tj1= new Ram("16GB","amd",0);
			miordenador.tarjetaGrafica= new TarjetaGrafica("AMD","6600xt", 32, 200,tj1 );
			
			
		
	        
	   
	        miordenador.listaperPerifericos = new ArrayList<>();
	        miordenador.listaperPerifericos.add(new Perifericos("Teclado", "Logitech", 80.0));
	        miordenador.listaperPerifericos.add(new Perifericos("Ratón", "Razer", 60.0));
	        miordenador.listaperPerifericos.add(new Perifericos("Monitor", "MSI", 149.99));
	        
	       System.out.println("Los componentes del ordenador son:");
	       System.out.println(miordenador.toString()); 
	       
	       System.out.println();
	       System.out.println();
	       
	       miordenador.precioTotal();
	       System.out.println(miordenador.toString());
	}
}
