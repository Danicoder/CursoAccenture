package Banco;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {

	final int IMPORTE_1 =100;
	final String CONCEPTO_1 ="prueba";
	final LocalDate fecha = LocalDate.now();
	
	Movimiento mov;
	
	@BeforeEach
	void creacion() {
		mov = new Movimiento();
	}

	@Test
	void testMovimiento() {
		creacion();
	}

	@Test
	void testGetmConcepto() {
		mov.setmConcepto(CONCEPTO_1);
		assertEquals(CONCEPTO_1,mov.getmConcepto());
	}

	@Test
	void testSetmConcepto() {
		mov.setmConcepto(CONCEPTO_1);
		assertEquals(CONCEPTO_1,mov.getmConcepto());
	}

	@Test
	void testGetmFecha() {
		mov.setmFecha(fecha);
		assertEquals(fecha,mov.getmFecha());
	}

	@Test
	void testSetmFecha() {
		mov.setmFecha(fecha);
		assertEquals(fecha,mov.getmFecha());
	}

	@Test
	void testGetnImporte() {
		mov.setnImporte(IMPORTE_1);
		assertEquals(IMPORTE_1,mov.getnImporte());
	}

	@Test
	void testSetnImporte() {
		mov.setnImporte(IMPORTE_1);;
		assertEquals(IMPORTE_1,mov.getnImporte());
	}
}
