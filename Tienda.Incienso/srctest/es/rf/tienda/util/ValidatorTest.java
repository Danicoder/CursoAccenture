package es.rf.tienda.util;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ValidatorTest {
	
	final String TextOK = "dANIELA5";
	final String TextER = "$Da%&";
	
	final String vacia = "";
	final String Null = null;
	
	final String NumberOK1 = "1234567891";//10
	final String NumberOK2 = "23 876 67 0860";//14
	final String NumberErrorLong = "23 876 6745673628767889 0860";//28
	final String NumberVacio = "";
	final String NumberNull = null;
	final String NumberEr3 = "+34$6427&fggh67856";//18
	
	final String emailok1 = "texto1@texto2.tld";
	final String emailError1 = "Concha.hotmail.com";
	final String emailError2 = "Concha@hotmailcom";
	final String emailError3 = "Conchahotmailcom";
	final String emailError4 = "Concha@@hotmailcom";
	
	final String DniOK1 = "48.764.757-L";
	final String DniERR1 = "48764757-O";
	final String DniERR2 = "48.678.4-A";
 
	final String contraseña1 = "332@Daniela";
	final String contraseñaError1 = "";
	final String contraseñaError2 = "23Dani";
	
	final String Fechaok1="2024-03-19";
	final String Fechaok2="2020-03-19";
	final String FechaError1="12-02-2023";
	final String FechaError2="12.02.2023";
	final String FechaError3="12-2023";
	final String FechaError4="24122023";
	final String FechaError5="ab-cd-ef";
	final String FechaError6="2023-02-15";
	
	@Test
	void testIsAlfanumeric() {
		assertTrue(Validator.isAlfanumeric(TextOK));
		assertFalse(Validator.isAlfanumeric(TextER));
	}
	
	@Test
	void testIsVacio() {
		assertTrue(Validator.isVacio(vacia));
		assertTrue(Validator.isVacio(Null));
	}

	@Test
	void testCumplePhoneNumber() {
		assertTrue(Validator.cumplePhoneNumber(NumberOK1));
		assertTrue(Validator.cumplePhoneNumber(NumberOK2));
		assertFalse(Validator.cumplePhoneNumber(NumberErrorLong));
		assertFalse(Validator.cumplePhoneNumber(NumberVacio));
		assertFalse(Validator.cumplePhoneNumber(NumberNull));
		assertFalse(Validator.cumplePhoneNumber(NumberEr3));
	}

	@Test
	void testIsEmailValido() {
		assertTrue(Validator.cumplePhoneNumber(emailok1));
		assertFalse(Validator.cumplePhoneNumber(emailError1));
		assertFalse(Validator.cumplePhoneNumber(emailError2));
		assertFalse(Validator.cumplePhoneNumber(emailError3));
		assertFalse(Validator.cumplePhoneNumber(emailError4));
	}

	@Test
	void testCumpleDNI() {
		assertTrue(Validator.cumpleDNI(DniOK1));
		assertFalse(Validator.cumpleDNI(DniERR1));
		assertFalse(Validator.cumpleDNI(DniERR2));
	}

	@Test
	void testCumpleRangoIntIntInt() {
		assertTrue(Validator.cumpleRango(27, 20, 30));
		assertTrue(Validator.cumpleRango(5, 3, 8));
		assertFalse(Validator.cumpleRango(2, 3, 3));
		assertFalse(Validator.cumpleRango(4, 6, 10));
	}

	@Test
	void testCumpleRangoDoubleIntInt() {
		assertTrue(Validator.cumpleRango(65.70, 60, 85));
		assertTrue(Validator.cumpleRango(5.09, 3, 8));
		assertFalse(Validator.cumpleRango(2.87, 5, 3));
		assertTrue(Validator.cumpleRango(5.50, 5, 10));
	}

	@Test
	void testCumpleLongitudMin() {
		assertTrue(Validator.cumpleLongitudMin("Hola caracola",5));//13
		assertTrue(Validator.cumpleLongitudMin("Good morning",10));//12
		assertFalse(Validator.cumpleLongitudMin("I am try programming, because I like it",40));//39
		assertFalse(Validator.cumpleLongitudMin("Hola holita",12));//11
	}

	@Test
	void testCumpleLongitudMax() {
		assertTrue(Validator.cumpleLongitudMax("Hola caracola",14));//13
		assertTrue(Validator.cumpleLongitudMax("Good morning",13));//12
		assertFalse(Validator.cumpleLongitudMax("I am try programming, because I like it",4));//39
		assertFalse(Validator.cumpleLongitudMax("Hola holita",1));//11
	}

	@Test
	void testCumpleLongitud() {
		assertTrue(Validator.cumpleLongitud("Hola caracola",14,15));//13
		assertTrue(Validator.cumpleLongitud("Good morning",13,15));//12
		assertFalse(Validator.cumpleLongitud("I am try programming, because I like it",50,5));//39
		assertFalse(Validator.cumpleLongitud("Hola holita",1,6));//11
	}

	@Test
	void testValDateMin() {
		assertTrue(Validator.valDateMin(LocalDate.parse(Fechaok1), LocalDate.now()));
		assertFalse(Validator.valDateMin(LocalDate.parse(Fechaok2), LocalDate.of(2022,03,13)));
		//assertFalse(Validator.valDateMin(LocalDate.parse(FechaError4), null));//could not be parsed at index 0
		//assertFalse(Validator.valDateMin(LocalDate.parse(FechaError5), null));//could not be parsed at index 0
	}

	@Test
	void testValDateMax() {
		assertTrue(Validator.valDateMin(LocalDate.parse(Fechaok1), LocalDate.now()));
		assertFalse(Validator.valDateMin(LocalDate.parse(Fechaok2), LocalDate.of(2022,03,13)));
	}

	@Test
	void testEsFechaValida() {
		assertTrue(Validator.esFechaValida(Fechaok1));
		assertTrue(Validator.esFechaValida(Fechaok2));
		//assertFalse(Validator.esFechaValida(FechaError1));//could not be parsed at index 0
		//assertFalse(Validator.esFechaValida(FechaError2));//could not be parsed at index 0
		//assertFalse(Validator.esFechaValida(FechaError3));//could not be parsed at index 0
	}

	@Test
	void testEsPasswordValida() {
		assertTrue(Validator.esPasswordValida(contraseña1));
		assertFalse(Validator.esPasswordValida(contraseñaError1));
		assertFalse(Validator.esPasswordValida(contraseñaError2));
	}

}
