package Banco.Utils;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Banco.Utils.Filtro;

class filtroTest {
	
	final String TITULAR1 = "Este titular es";//15
	final String TITULAR2 = "Este tirular es de 21567894789478945";//36
	final String TITULAR3 = "";
	final String TITULAR4 = "asdgdfgfdhgfhgfhhhhhhhhhhhh";//27
	
	Filtro filtro;
	@BeforeAll
	void Creacion() {
		filtro = new Filtro();
	}
	
	@Test
	void testTMaxPasa27() {
		assertTrue(filtro.tMax(TITULAR1, 30));
	}
	@Test
	void testTMaxPasa21() { //El resultado a de ser verdadero
		assertTrue(filtro.tMax(TITULAR1, 30));
	}
	@Test
	void testTMaxNull() { //El resultado a de ser falso
		assertTrue(filtro.tMax(TITULAR3, 30));
	}

	@Test
	void testTMinEncima() {//por encima
		assertTrue(filtro.tMin(TITULAR2, 20));
	}
	@Test
	void testTMinDebajo() {//por debajo
		assertTrue(filtro.tMax(TITULAR1, 20));
	}
	@Test
	void testTMinNullo() {//nulo
		assertTrue(filtro.tMax(TITULAR3, 20));
	}

	@Test
	void testCumpleRangoLongitud() {
		assertFalse(filtro.cumpleRangoLongitud(TITULAR3,30,20));
	}
	@Test
	void testCumpleRangoLongitudTrue() {
		assertTrue(filtro.cumpleRangoLongitud(TITULAR4,30,20));
	}

	@Test
	void testFmax() {
		assertFalse(filtro.fmax(LocalDate.now(), 5));
	}

	@Test
	void testFmin() {
		System.out.println(filtro.fmin(LocalDate.now(), 5));
		assertTrue(filtro.fmin(LocalDate.now(), 5));
	}

	@Test
	void testFechafiltro() {
		assertFalse(filtro.fechaFiltro(LocalDate.now(), 5, 3));
	}

}
