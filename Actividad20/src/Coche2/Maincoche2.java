package Coche2;

import java.util.ArrayList;

import java.util.Scanner;

public class Maincoche2 {
	Scanner scan = new Scanner(System.in);
	ArrayList<coche> listacoches = new ArrayList<>();

	public static void main(String[] args) {
		Maincoche2 main= new Maincoche2();
		main.arrancarPrograma();
	
		
	}
	

	
	public void arrancarPrograma() {
		int opcion = 0;
		do {
			System.out.println("seleccione una de estas 5 opciones");
			System.out.println("1. crear coche");
			System.out.println("2. mostrar coche");
			System.out.println("3. mostrar contador de ID");
			System.out.println("4. Resetear contador ID");
			System.out.println("5. Salir del programa");

			opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				crearCoche();

				break;
			case 2:
				mostrarCoche();

				break;
			case 3:
				mostrarCont();

				break;

			case 4:
				coche.resetCont();
				break;

			case 5:
				System.out.println("progrrama finalizado");
				break;

			default:
				System.out.println("valor no valido, intentelo nuevamente");
				break;
			}

		} while (opcion != 5);

	}

	public void crearCoche() {
		
		coche Coche = new coche();
		System.out.println("introduzca la matricula");
		Coche.matricula = scan.next();

		System.out.println("las marcas que tenemos son: " + coche.RENAULT +" "+ coche.TOYOTA);
		System.out.println("escoge una opcion");
		Coche.marca = scan.next().toUpperCase();
		
		listacoches.add(Coche);
		
		

		
	}

	public void mostrarCoche() {
		for (coche Coche : listacoches) {
			System.out.println(Coche.toString());
		}

		}
		
	
	 public void mostrarCont() {
		 System.out.println("el id actual es: "+ coche.getContadorID());
		
	 }
	

}
