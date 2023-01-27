package Banco;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DebitoTest {
	
	final LocalDate fecha = LocalDate.now();
	final String TITULAR = "Daniela García";
	final String NUMEROCTO_CTA = "12345689";
	final double IMPORTE30 = 30;
	final double IMPORTE50 = 50;
	Debito deb;
	@BeforeEach
	void creacion() {
		deb = new Debito(fecha,NUMEROCTO_CTA,TITULAR);
	}
	
	@Test
	void testGetSaldo() throws Exception {
		deb.ingresar(IMPORTE30);
		assertEquals(IMPORTE30,deb.getSaldo());
	}

	@Test
	void testIngresar() throws Exception {
		deb.ingresar(IMPORTE50);
		assertEquals(IMPORTE50,deb.getSaldo());
	}
	@Test
	void testIngresar_2() throws Exception {
		Assertions.assertThrows(Exception.class, () -> {
			deb.ingresar(IMPORTE30);
		});
	}

	@Test
	void testPagoEnEstablecimiento() throws Exception {
		deb.ingresar(IMPORTE50);
		deb.retirar(IMPORTE30);
		assertEquals(20,deb.getSaldo());
	}

	@Test
	void testRetirar() throws Exception {
		deb.ingresar(IMPORTE50);
		deb.retirar(IMPORTE30);
		assertEquals(20,deb.getSaldo());
	}

	@Test
	void testDebito() {
		creacion();
	}

	@Test
	void testTarjeta() {
		Tarjeta tdeb = new Debito(fecha, NUMEROCTO_CTA, TITULAR);
		assertEquals(tdeb,deb.getmCuentaAsociada());
	}

	@Test
	void testSetCuenta() {
		Cuenta c = new Cuenta(NUMEROCTO_CTA, TITULAR);
		assertEquals(c.nNumero,deb.getmCuentaAsociada());
	}

	@Test
	void testGetMfechaDeCaducidad() {
		deb.setMfechaDeCaducidad(fecha);
		assertEquals(fecha,deb.getMfechaDeCaducidad());
	}

	@Test
	void testSetMfechaDeCaducidad() {
		deb.setMfechaDeCaducidad(fecha);
		assertEquals(fecha,deb.getMfechaDeCaducidad());
	}

	@Test
	void testGetmNumero() {
		deb.setmNumero(NUMEROCTO_CTA);
		assertEquals(NUMEROCTO_CTA,deb.getmNumero());
	}

	@Test
	void testSetmNumero() {
		deb.setmNumero(NUMEROCTO_CTA);
		assertEquals(NUMEROCTO_CTA,deb.getmNumero());
	}

	@Test
	void testGetmTitular() {
		deb.setmTitular(TITULAR);
		assertEquals(TITULAR,deb.getmTitular());
	}

	@Test
	void testSetmTitular() {
		deb.setmTitular(TITULAR);
		assertEquals(TITULAR,deb.getmTitular());
	}

}
