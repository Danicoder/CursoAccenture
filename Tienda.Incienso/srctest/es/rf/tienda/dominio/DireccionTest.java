package es.rf.tienda.dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.rf.tienda.exception.DomainException;

class DireccionTest {
	
	final String NO_ALFANUMERIC = "@#%{) _";
	
	final String NOMBREOK = "Daniela García";//14
	final String NOMBRERRORMIN = "Noa";
	final String NOMBRERRORMAX = "Hola estoy escribiendo algo de relleno para pasarme de longitud y hacer pruebas, me estoy intentando pasar de 100";
	
	final String DIRECCIONOK = "Calle de Gravina 4";
	
	final String POBLACION = "Alicante";

	final String C_POSTAL="03002";
	
	final String PROVINCIA="Alicante";
	
	final String PAIS="España";
	
	final String EMAIL="daniela@hotmail.com";


	Direccion dir;
	@BeforeEach
	void creacion() {
		dir = new Direccion();
	}
	@Test
	void testDireccion() {
		creacion();
	}

	@Test//no entra en el if , cuando tiene 14 caracteres, y esta comprendido entre esos valores
	void testSetDir_nombre() throws DomainException {
		dir.setDir_nombre(NOMBREOK);
		assertEquals(NOMBREOK,dir.getDir_nombre());
	}
	@Test
	void testSetDir_nombre_error1(){
		DomainException thrown = Assertions.assertThrows(DomainException.class, () -> {
			dir.setDir_nombre(NO_ALFANUMERIC);
	  });
	  Assertions.assertEquals("Domain: El nombre ha de contener entre 5 y 100 caracteres",thrown.getMessage());
	}
	@Test//deberia de funcionar al ser un caracter menos a 5
	void testSetDir_nombre_error2(){
		DomainException thrown = Assertions.assertThrows(DomainException.class, () -> {
			dir.setDir_nombre(NOMBRERRORMIN);
		});
		Assertions.assertEquals("Domain: El nombre ha de contener entre 5 y 100 caracteres",thrown.getMessage());
	}
	@Test
	void testSetDir_nombre_error3(){
		DomainException thrown = Assertions.assertThrows(DomainException.class, () -> {
			dir.setDir_nombre(NOMBRERRORMAX);
		});
		Assertions.assertEquals("Domain: El nombre ha de contener entre 5 y 100 caracteres",thrown.getMessage());
	}

	@Test//lanza exception
	void testGetDir_direccion() throws DomainException {
		dir.setDir_direccion(DIRECCIONOK);
		assertEquals(DIRECCIONOK,dir.getDir_direccion());
	}
	
	@Test//lanza exception
	void testSetDir_direccion() throws DomainException {
		dir.setDir_direccion(DIRECCIONOK);
		assertEquals(DIRECCIONOK,dir.getDir_direccion());
	}
	
	@Test
	void testGetDir_direccion_error(){
		DomainException thrown = Assertions.assertThrows(DomainException.class, () -> {
			dir.setDir_direccion(NO_ALFANUMERIC);
		});
		Assertions.assertEquals("Domain: Debe ser minúscula, mayúscula con dígitos entre 0 y 9",thrown.getMessage());
	}

	@Test//NullPointerException
	void testGetDir_poblacion() throws DomainException {
		dir.setDir_poblacion(POBLACION);
		assertEquals(POBLACION,dir.getDir_poblacion());
	}

	@Test//NullPointerException
	void testSetDir_poblacion() throws DomainException {
		dir.setDir_poblacion(POBLACION);
		assertEquals(POBLACION,dir.getDir_poblacion());
	}
	
	@Test
	void testSetDir_poblacion_error() {
		DomainException thrown = Assertions.assertThrows(DomainException.class, () -> {
			dir.setDir_poblacion(NO_ALFANUMERIC);
		});
		Assertions.assertEquals("Domain: Debe ser minúscula, mayúscula con dígitos entre 0 y 9",thrown.getMessage());
	}

	@Test
	void testGetDir_cPostal() throws DomainException {
		dir.setDir_cPostal(C_POSTAL);
		assertEquals(C_POSTAL,dir.getDir_cPostal());
	}

	@Test
	void testSetDir_cPostal1() throws DomainException {
		dir.setDir_cPostal(C_POSTAL);
		assertEquals(C_POSTAL,dir.getDir_cPostal());
	}
	@Test
	void testSetDir_cPostal(){
		DomainException thrown = Assertions.assertThrows(DomainException.class, () -> {
			dir.setDir_direccion(NO_ALFANUMERIC);
		});
		Assertions.assertEquals("Domain: Debe ser minúscula, mayúscula con dígitos entre 0 y 9",thrown.getMessage());
	}

	@Test
	void testGetDir_provincia() throws DomainException {
		dir.setDir_provincia(PROVINCIA);
		assertEquals(PROVINCIA,dir.getDir_provincia());
	}

	@Test
	void testSetDir_provincia() throws DomainException {
		dir.setDir_provincia(PROVINCIA);
		assertEquals(PROVINCIA,dir.getDir_provincia());
	}
	@Test
	void testSetDir_provincia_error(){
		DomainException thrown = Assertions.assertThrows(DomainException.class, () -> {
			dir.setDir_provincia(NO_ALFANUMERIC);
		});
		Assertions.assertEquals("Domain: Debe ser minúscula, mayúscula con dígitos entre 0 y 9",thrown.getMessage());
	}

	@Test
	void testGetDir_pais() throws DomainException {
		dir.setDir_pais(PAIS);
		assertEquals(PAIS,dir.getDir_pais());
	}

	@Test//NullPointerException
	void testSetDir_pais() throws DomainException {
		dir.setDir_pais(PAIS);
		assertEquals(PAIS,dir.getDir_pais());
	}
	
	@Test//NullPointerException
	void testSetDir_pais_error() {
		DomainException thrown = Assertions.assertThrows(DomainException.class, () -> {
			dir.setDir_provincia(NO_ALFANUMERIC);
		});
		Assertions.assertEquals("Domain: Debe ser minúscula, mayúscula con dígitos entre 0 y 9",thrown.getMessage());
	}

	@Test//lanza una exception
	void testGetDir_correoE() throws DomainException {
		dir.setDir_correoE(EMAIL);
		assertEquals(EMAIL,dir.getDir_correoE());
	}

	@Test//lanza exepcion
	void testSetDir_correoE() throws DomainException {
		dir.setDir_correoE(EMAIL);
		assertEquals(EMAIL,dir.getDir_correoE());
	}
	
	@Test
	void testSetDir_correoE_error(){
		DomainException thrown = Assertions.assertThrows(DomainException.class, () -> {
			dir.setDir_provincia(NO_ALFANUMERIC);
		});
		Assertions.assertEquals("Domain: Debe ser minúscula, mayúscula con dígitos entre 0 y 9",thrown.getMessage());
	}
}
