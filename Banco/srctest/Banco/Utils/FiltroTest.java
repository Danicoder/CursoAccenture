package Banco.Utils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;


class FiltroTest {
	
	final String TITULAR1 = "soy un titular de prueba";//24
	final String TITULAR2 = "Este tirular es de 21567894789478945";//36
	final String TITULAR3 = "titular";//7
	final String TITULARVACIO = "";
	final String TITULARNULL=null;
	final String TITULAR4 = "asdgdfgfdhgfhgfhhhhhhhhhhhh";//27
	
	final LocalDate FECHAOKBEFORE = LocalDate.of(2024, 01, 10);
	final LocalDate FECHAOKAFTER = LocalDate.of(2019, 01, 10);
	final LocalDate HOY = LocalDate.now();
	
	Filtro filtro;
	@BeforeAll
	void creacion() {
		filtro = new Filtro();
	}
	@Test
	void testTMaxPasa27() {
		assertTrue(filtro.tMax(TITULAR4,30));
		assertFalse(filtro.tMax(TITULAR3,30));
	}
	@Test
	void testTMaxPasa24() {
		assertTrue(filtro.tMax(TITULAR1, 30));
	}
	@Test
	void testTMaxNull() {
		assertTrue(filtro.tMax(TITULARNULL, 30));
	}

	@Test
	void testTMinEncima() {
		assertTrue(filtro.tMin(TITULAR2, 20));
	}
	@Test
	void testTMinDebajo() {
		assertTrue(filtro.tMax(TITULAR3, 20));
	}
	@Test
	void testTMinNullo() {
		assertTrue(filtro.tMax(TITULARNULL, 20));
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
		assertFalse(filtro.fmax(HOY, FECHAOKBEFORE));
	}

	@Test
	void testFmin() {
		System.out.println(filtro.fmin(FECHAOKAFTER,HOY));
		assertTrue(filtro.fmin(FECHAOKAFTER,HOY));
	}

	@Test
	void testFechafiltro() {
		assertTrue(filtro.fechaFiltro(HOY,FECHAOKAFTER,FECHAOKBEFORE));
	}
}
