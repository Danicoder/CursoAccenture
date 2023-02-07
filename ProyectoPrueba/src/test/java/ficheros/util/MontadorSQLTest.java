package ficheros.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MontadorSQLTest {
	
	final String NOMBRE_CAMPO = "NombreCampo";
	final String NOMBRE_CAMPOS = "OtroCampo";
	
	final int VALOR_INT = 20;
	final String VALOR_STRING ="Texto en cadena";
	final double VALOR_DOUBLE =120.05;
	final long VALOR_LONG = 12345678;
	
	final String SALIDA1 ="NombreCampo=20";
	final String SALIDA2 ="NombreCampo=120.05";
	final String SALIDA3 ="NombreCampo=12345678";
	final String SALIDA4 ="NombreCampo='Texto en cadena'";
	final String SALIDA_LARGA ="NombreCampo=20 , OtroCampo='Texto en cadena'";
	
	@Test
	void testAddSalidaLarga() {
		String salida ="";
		salida = MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_INT,",");
		salida = MontadorSQL.addSalida(salida,NOMBRE_CAMPOS,VALOR_STRING,",");
		assertEquals(SALIDA_LARGA.trim(),salida.trim());
	}
	@Test
	void testAddSalidaStringStringIntString() {
		String salida ="";
		salida = MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_INT,",");
		assertEquals(SALIDA1,salida);
	}

	@Test
	void testAddSalidaStringStringDoubleString() {
		String salida ="";
		salida = MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_DOUBLE,",");
		assertEquals(SALIDA2,salida);
	}

	@Test
	void testAddSalidaStringStringLongString() {
		String salida ="";
		salida = MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_STRING,",");
		assertEquals(SALIDA4,salida);
	}

	@Test
	void testAddSalidaStringStringStringString() {
		String salida ="";
		salida = MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_LONG,",");
		assertEquals(SALIDA3,salida);
	}

	@Test
	void testAddSalidaSencilla() {
		String salida ="";
		salida = MontadorSQL.addSalida(salida,NOMBRE_CAMPO,VALOR_STRING,",");
		assertEquals(SALIDA4,salida);
	}
}
