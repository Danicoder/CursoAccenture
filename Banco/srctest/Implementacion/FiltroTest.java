package Implementacion;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class FiltroTest {
	
	final String TITULAR1 = "Este titular es";//15
	final String TITULAR2 = "Este tirular es de 21567894789478945";//36
	final String TITULAR3 = "";
	final String TITULAR4 = "asdgdfgfdhgfhgfhhhhhhhhhhhh";//27
	
	
	@Test
	void testTMaxPasa27() {
		assertTrue(Filtro.tMax(TITULAR1, 30));
	}
	@Test
	void testTMaxPasa21() { //El resultado a de ser verdadero
		assertTrue(Filtro.tMax(TITULAR1, 30));
	}
	@Test
	void testTMaxNull() { //El resultado a de ser falso
		assertTrue(Filtro.tMax(TITULAR3, 30));
	}

	@Test
	void testTMinEncima() {//por encima
		assertTrue(Filtro.tMin(TITULAR2, 20));
	}
	@Test
	void testTMinDebajo() {//por debajo
		assertTrue(Filtro.tMax(TITULAR1, 20));
	}
	@Test
	void testTMinNullo() {//nulo
		assertTrue(Filtro.tMax(TITULAR3, 20));
	}

	@Test
	void testCumpleRangoLongitud() {
		assertFalse(Filtro.cumpleRangoLongitud(TITULAR3,30,20));
	}
	@Test
	void testCumpleRangoLongitudTrue() {
		assertTrue(Filtro.cumpleRangoLongitud(TITULAR4,30,20));
	}

	@Test
	void testFmax() {
		assertFalse(Filtro.fmax(LocalDate.now(), 5));
	}

	@Test
	void testFmin() {
		System.out.println(Filtro.fmin(LocalDate.now(), 5));
		assertTrue(Filtro.fmin(LocalDate.now(), 5));
	}

	@Test
	void testFechaFiltro() {
		assertFalse(Filtro.fechaFiltro(LocalDate.now(), 5, 3));
	}

}
