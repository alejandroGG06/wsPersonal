package JunitNotaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Actividad14.Soldado;

import Actividad14.dorsales;

class testSoldadoJugador {

	@Test
	public void siDispara() {
		Soldado sol1 = new Soldado();
		sol1.setNumeroBalas(5);

		int resultado = sol1.getNumeroBalas();
		assertTrue(sol1.puedeDisparar());
	}

	@Test
	public void NoPuedeDisparar() {
		Soldado sol2 = new Soldado();
		sol2.setNumeroBalas(-1);
		assertFalse(sol2.puedeDisparar());
	}

	@Test
	public void puedeDispararBalas0() {
		Soldado sol3 = new Soldado();
		sol3.setNumeroBalas(0);

		boolean esperado = false;
		int resultado = sol3.getNumeroBalas();
		assertEquals(false, sol3.puedeDisparar());
	}

	@Test
	public void siMuere() {
		Soldado sol4 = new Soldado();
		Soldado solP = new Soldado();
		sol4.setNumeroBalas(1);
		sol4.disparar(solP);

		assertTrue(solP.isEstaMuerto());

		assertEquals(0, sol4.getNumeroBalas());
	}

	@Test
	public void dorsalValido() {
		dorsales d1 = new dorsales();

		d1.setDorsal(10);

		assertEquals(10, d1.getDorsal());

	}

	@Test
	public void dorsalNovalido() {
		dorsales d2 = new dorsales();
		d2.ponerDorsal(35);

		int esperado = -1;
		int resultado = d2.getDorsal();

		assertEquals(esperado, resultado);
	}

	@Test
	public void noExpulsado() {
		
		dorsales j1= new dorsales();
		
		j1.setNumeroTarjetasAmarillas(1);
		assertFalse(j1.estaExpulsado());

	}
	@Test
	public void expulsadoPorAmarillas() {
		dorsales j2 = new dorsales();
		
		j2.setNumeroTarjetasAmarillas(2);
		assertTrue(j2.estaExpulsado());
	}
	@Test 
	public void expulsadoPorRojas() {
		dorsales j3 = new dorsales();
		j3.setNumeroTarjetasRojas(1);
		assertTrue(j3.estaExpulsado());
	}
}
