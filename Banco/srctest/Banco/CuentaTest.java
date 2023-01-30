package Banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Banco.Utils.Filtro;

class CuentaTest {
	Cuenta cuenta;

	final String NUMEROCTO_CTA = "12345689";
	final String TITULAR = "qwertysdsfsdfdswertysdsfsdfdsf";
	final String TITULAR_ERR = "qwer";
	final double IMPORTE_m1 = -1;
	final double IMPORTE1000 = 1000.0;
	final double IMPORTE050 = 500;
	final String CONCEPTO_OK = "eSTO CUMPLE CON LA NORMA DE SER NEMOR DE 100";
	final String CONCEPTO_ERROR = "eSTO NO CUMPLE CON LA NORMA DE SER NEMOR DE 100";

	@BeforeEach
	void creacion() {
		cuenta = new Cuenta(NUMEROCTO_CTA, TITULAR);
	}

	@Test
	void testCuenta() {
			creacion();
	}

	@Test
	void testGetnNumero() {
		cuenta.setnNumero(NUMEROCTO_CTA);
		assertEquals(NUMEROCTO_CTA, cuenta.getnNumero());
	}

	@Test
	void testSetnNumero() {
		cuenta.setnNumero(NUMEROCTO_CTA);;
		assertEquals(NUMEROCTO_CTA, cuenta.getnNumero());
	}

	@Test
	void testGetmTitular() {
		cuenta.setmTitular(TITULAR);
		assertEquals(TITULAR, cuenta.getmTitular());
	}

	@Test
	void testSetmTitular() {
		cuenta.setmTitular(TITULAR);
		assertEquals(TITULAR, cuenta.getmTitular());
	}

	@Test
	void testGetSaldo() throws Exception {
		cuenta.ingresar(IMPORTE1000);
		assertEquals(IMPORTE1000, cuenta.getSaldo());
	}

	@Test
	void testIngresarDouble() throws Exception {
		cuenta.ingresar(IMPORTE1000);
		assertEquals(IMPORTE1000,cuenta.getSaldo());
	}
	@Test
	void testIngresarDouble_1() throws Exception {
		Assertions.assertThrows(Exception.class, () -> {
			cuenta.ingresar(IMPORTE_m1);
		});
	}

	@Test
	void testIngresarDoubleERROR() throws Exception {
			cuenta.ingresar(CONCEPTO_ERROR, IMPORTE1000);
			assertEquals(IMPORTE1000, cuenta.getSaldo());
	}

	@Test
	void testIngresarStringDouble() throws Exception {
			cuenta.ingresar(CONCEPTO_OK, IMPORTE1000);
			assertEquals(IMPORTE1000, cuenta.getSaldo());
	}

	@Test
	void testRetirarDouble() throws Exception {
		cuenta.ingresar(IMPORTE1000);
		cuenta.retirar(IMPORTE050);
		assertEquals(IMPORTE050, cuenta.getSaldo());
	}

	@Test
	void testRetirarStringDouble() throws Exception {
		cuenta.ingresar(IMPORTE1000);
		cuenta.retirar(CONCEPTO_OK, IMPORTE050);//0500
		assertEquals(IMPORTE050, cuenta.getSaldo());
	}
	@Test
	void testRetirarStringDouble_error() throws Exception {
			cuenta.retirar(CONCEPTO_ERROR, IMPORTE1000);
	}
	@Test
	void testRetirarStringDouble_errorImp() throws Exception {
		Assertions.assertThrows(Exception.class, () -> {
			cuenta.retirar(CONCEPTO_OK, IMPORTE_m1);
		});
	}
}
