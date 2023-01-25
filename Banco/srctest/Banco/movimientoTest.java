package Banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class movimientoTest {
	movimiento mov;
	final int IMPORTE_1 =100;
	
	@BeforeEach
	void creacion() {
		mov = new movimiento();
	}
	@Test
	void testMovimientoStringLocalDateDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testMovimiento() {
		fail("Not yet implemented");
	}

	@Test
	void testGetmConcepto() {
		fail("Not yet implemented");
	}

	@Test
	void testSetmConcepto() {
		fail("Not yet implemented");
	}

	@Test
	void testGetmFecha() {
		fail("Not yet implemented");
	}

	@Test
	void testSetmFecha() {
		fail("Not yet implemented");
	}

	@Test
	void testGetnImporte() {
		mov.setnImporte(IMPORTE_1);
		assertEquals(IMPORTE_1,mov.getnImporte());
	}

	@Test
	void testSetnImporte() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
