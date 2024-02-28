package act_16;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainEquipo {

	public static void main(String[] args) {

		  Scanner scanner = new Scanner(System.in);

	        ArrayList<Equipo> equipos = new ArrayList<>();

	        
	        System.out.println("Ingrese el nombre del primer equipo:");
	        String nombreEquipo1 = scanner.nextLine();
	        System.out.println("Ingrese los nombres de los jugadores del primer equipo (separados por comas):");
	        String jugadoresEquipo1Input = scanner.nextLine();
	        String[] jugadoresEquipo1Array = jugadoresEquipo1Input.split(",");
	        ArrayList<String> jugadoresEquipo1 = new ArrayList<>(Arrays.asList(jugadoresEquipo1Array));
	        equipos.add(new Equipo(nombreEquipo1, jugadoresEquipo1));

	        
	        System.out.println("Ingrese el nombre del segundo equipo:");
	        String nombreEquipo2 = scanner.nextLine();
	        System.out.println("Ingrese los nombres de los jugadores del segundo equipo (separados por comas):");
	        String jugadoresEquipo2Input = scanner.nextLine();
	        String[] jugadoresEquipo2Array = jugadoresEquipo2Input.split(",");
	        ArrayList<String> jugadoresEquipo2 = new ArrayList<>(Arrays.asList(jugadoresEquipo2Array));
	        equipos.add(new Equipo(nombreEquipo2, jugadoresEquipo2));

	        	ArrayList<String> equipo2= new ArrayList();
	        	equipo2.add(jugadoresEquipo2Input);
	       
	        for (Equipo equipo : equipos) {
	            System.out.println(equipo.toString());
	            System.out.println();

	            equipo.mostrarJugadores();
	            System.out.println();

	            System.out.println("¿Existe el jugador 'Carlos' en el equipo? " + equipo.existeJugador("Carlos"));
	            System.out.println();

	            System.out.println("Número de jugadores: " + equipo.NumeroJugadores());
	            System.out.println();

	            System.out.println("¿El equipo es apto para jugar? " + equipo.aptoOno());
	            System.out.println();

	            System.out.println("¿La lista de jugadores es igual a la del equipo? " + equipo.ListaIgual(jugadoresEquipo2));

	            System.out.println();
	            System.out.println("¿El equipo es igual al primer equipo creado? " + equipo.IgualEquipo(equipos.get(0)));
	        }
	    }
	}

	            
	           
