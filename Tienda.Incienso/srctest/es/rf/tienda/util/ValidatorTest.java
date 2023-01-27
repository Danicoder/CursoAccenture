package es.rf.tienda.util;

import static org.junit.jupiter.api.Assertions.*;

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
	
	final String emailok1 = "texto@texto2.tld";
	final String emailError1 = "texto@teXto2-_.tld";
	final String emailError2 = "Concha.hotmail.com";
	final String emailError3 = "Concha@hotmailcom";
	
	@Test
	void testIsAlfanumeric() {
		System.out.println();
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
		System.out.println(Validator.cumplePhoneNumber(emailok1)+"1");
		assertTrue(Validator.cumplePhoneNumber(emailok1));
		System.out.println(Validator.cumplePhoneNumber(emailError1)+"2");
		assertFalse(Validator.cumplePhoneNumber(emailError1));
		System.out.println(Validator.cumplePhoneNumber(emailError2)+"3");
		assertFalse(Validator.cumplePhoneNumber(emailError2));
		System.out.println(Validator.cumplePhoneNumber(emailError3)+"4");
		assertFalse(Validator.cumplePhoneNumber(emailError3));
	}

	@Test
	void testCumpleDNI() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleRangoIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleRangoDoubleIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleLongitudMin() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleLongitudMax() {
		fail("Not yet implemented");
	}

	@Test
	void testCumpleLongitud() {
		fail("Not yet implemented");
	}

	@Test
	void testValDateMin() {
		fail("Not yet implemented");
	}

	@Test
	void testValDateMax() {
		fail("Not yet implemented");
	}

	@Test
	void testEsFechaValida() {
		fail("Not yet implemented");
	}

	@Test
	void testEsPasswordValida() {
		fail("Not yet implemented");
	}

}
