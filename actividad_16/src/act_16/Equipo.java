package act_16;

import java.util.ArrayList;
import java.util.Arrays;

public class Equipo {
	public String nombre;
	public ArrayList<String> jugadores;

	public Equipo() {
		super();
	}

	public Equipo(String nombre, ArrayList<String> jugadores) {
		this.nombre = nombre;
		this.jugadores = jugadores;
	}

	public String toString() {
		return "Equipo: " + nombre + "\nJugadores: " + jugadores.toString();
	}

	public void mostrarJugadores() {
		System.out.println("Jugadores del equipo " + nombre + ": " + (jugadores));
	}

	public boolean existeJugador(String jugador) {
		return jugadores.contains(jugador); 
	}

	public int NumeroJugadores() {
		return jugadores.size();
	}

	public boolean aptoOno() {
		return jugadores.size() >= 7;
	}

	public boolean ListaIgual(ArrayList<String> otraLista) {
		return jugadores.equals(otraLista);
	}

	public boolean IgualEquipo(Equipo otroEquipo) {
		return this.nombre.equals(otroEquipo.nombre) && this.jugadores.equals(otroEquipo.jugadores);
	}
}
