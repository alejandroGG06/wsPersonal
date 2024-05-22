package Actividad23;

import java.util.HashMap;
import java.util.Scanner;

public class mainPersona {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Persona> listaPersonas = new HashMap<>();

		int opcion;

		do {
			System.out.println("menu de creacion");
			System.out.println("1. Introducir persona");
			System.out.println("2. Mostrar personas");
			System.out.println("3. Buscar por nombre");
			System.out.println("4. Salir del programa");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.print("Nombre: ");
				String nombre = sc.next();

				if (listaPersonas.containsKey(nombre)) {
					System.out.print("La persona ya existe. ¿Deseas sobrescribirla? (y/n): ");
					String respuesta = sc.next();

					if (respuesta.equalsIgnoreCase("y")) {

						System.out.print("Edad: ");
						int edad = sc.nextInt();
						System.out.print("Peso: ");
						double peso = sc.nextDouble();

						listaPersonas.put(nombre, new Persona(nombre, edad, peso));
					}
				} else {

					System.out.print("Edad: ");
					int edad = sc.nextInt();
					System.out.print("Peso: ");
					double peso = sc.nextDouble();

					listaPersonas.put(nombre, new Persona(nombre, edad, peso));
				}
				break;

			case 2:
				System.out.println(listaPersonas.toString());
				break;

			case 3:
				System.out.println("introduce la persona a buscar");
				String busca= sc.next();
				
				if (listaPersonas.containsKey(busca)) {
					Persona persona= listaPersonas.get(busca);
					System.out.println("nombre: "+ persona.getNombre()+" edad: "+ persona.getEdad()+" peso: "+persona.getPeso());
					
				}
				break;
			case 4: System.out.println("saliendo del programa");
			
				break;
			}
		} while (opcion != 4);

	}

}
