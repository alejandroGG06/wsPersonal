package Objetos;

public class Actividad010 {

	public static void main(String[] args) {
		
		
		Carro c1= new Carro();
		
		c1.marca = "MERCEDES ";
		c1.modelo= "Clase E";
		c1.peso= 1_825;
		c1.electrico= true;
		c1.matricula= "1233 EFF";
		c1.AniosDeAntiguedad= 3;
		
		Carro c2=new Carro();
		c2.marca = "ROLL ROYCE";
		c2.modelo= "PHANTOM";
		c2.peso= 2_485;
		c2.electrico= false;
		c2.matricula= "HY67 VAK ";
		c2.AniosDeAntiguedad= 21;
		
		Carro c3=new Carro();
		c3.marca = "LAMBORGHINI";
		c3.modelo= "HURACAN STERRATO";
		c3.peso= 1_470;
		c3.electrico= false;
		c3.matricula= "1233 HUR ";
		c3.AniosDeAntiguedad= 2;
		
		Imprimir(c1);
		System.out.println("//////////////////////////////");
		Imprimir(c2);
		System.out.println("/////////////////////////////");
		Imprimir(c3);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		
		}
	public static void Imprimir(Carro c) 
	{  System.out.println(c.marca);
		System.out.println(c.modelo);
		System.out.println(c.peso);
		System.out.println(c.electrico);
		System.out.println(c.matricula);
		System.out.println(c.AniosDeAntiguedad);
	}
	

}
