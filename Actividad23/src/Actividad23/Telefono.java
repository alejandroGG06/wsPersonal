package Actividad23;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Telefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> listaTelefonica = new HashMap<>();

		System.out.println("introduzca 5 numeros");
		for (int i = 0; i < 5; i++) {
			System.out.println("introduce el nombre");
			String nombre = sc.next();
			System.out.println("introduce el numero telefonico");
			int telefono = sc.nextInt();
			listaTelefonica.put(nombre, telefono);
			System.out.println();

			System.out.println("Lista telefonica:");

			for (Entry<String, Integer> entry : listaTelefonica.entrySet()) {
				System.out.println("nombre: " + entry.getKey() + " numero: " + entry.getValue());

			}

		}

	}

}
