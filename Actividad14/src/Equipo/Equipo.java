package Equipo;

import java.util.Arrays;

public class Equipo {
	private String nombre;
	private String[] jugadores;

	public Equipo() {
		super();
	}

	public Equipo(String nombre, String[] jugadores) {
		this.nombre = nombre;
		this.jugadores = jugadores;
	}

	public String toString() {
		return "Equipo: " + nombre + "\nJugadores: " + Arrays.toString(jugadores);
	}

	public void mostrarJugadores() {
		System.out.println("Jugadores del equipo " + nombre + ": " + Arrays.toString(jugadores));
	}

	public boolean existeJugador(String jugador) {
		return Arrays.asList(jugadores).contains(jugador);
	}

	public int NumeroJugadores() {
		return jugadores.length;
	}

	public boolean aptoOno() {
		return jugadores.length >= 7;
	}

	public boolean ListaIgual(String[] otraLista) {
		return Arrays.equals(jugadores, otraLista);
	}

	public boolean IgualEquipo(Equipo otroEquipo) {
		return this.nombre.equals(otroEquipo.nombre) && Arrays.equals(this.jugadores, otroEquipo.jugadores);
	}
}
