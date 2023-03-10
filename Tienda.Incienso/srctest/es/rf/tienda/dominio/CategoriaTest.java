package es.rf.tienda.dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CategoriaTest {
	
	final String NULL =null;
	
	final String NOMBREOK1 = "Incienso";
	final String NOMBREERRORLONGITUDMAX = "Me estoy pasando de longitud para hacer el test debo medir mas de 50";//69
	final String NOMBREERRORLONGITUDMIN = "Hola";
	
	final String DESCRIPCIONOK1 = "Incienso";
	final String VACIO = "";
	final String DESCRIPCIONLONGITUDMAX = "Me estoy pasando de longitud para hacer el test";//47
	final String DESCRIPCIONLONGITUDMIN = "Hola";

	Categoria categoria;
	final Object OBJETO1 = categoria;
	final Object OBJETO2 = categoria;
	
	
	@BeforeEach
	void creacion() {
		categoria = new Categoria();
	}
	@Test
	void testCategoria() {
		creacion();
	}

	@Test
	void testGetCat_nombre() throws Exception {
		categoria.setCat_nombre(NOMBREOK1);
		assertEquals(NOMBREOK1,categoria.getCat_nombre());
	}

	@Test
	void testSetCat_nombre() throws Exception {
		categoria.setCat_nombre(NOMBREOK1);
		assertEquals(NOMBREOK1,categoria.getCat_nombre());
	}

	@Test
	void testGetCat_descripcion() throws Exception{
		categoria.setCat_descripcion(DESCRIPCIONOK1);
		assertEquals(DESCRIPCIONOK1,categoria.getCat_descripcion());
	}

	@Test
	void testSetCat_descripcion() throws Exception {
		categoria.setCat_descripcion(DESCRIPCIONOK1);
		assertEquals(DESCRIPCIONOK1,categoria.getCat_descripcion());
	}

	@Test
	void testEqualsObject() {
		assertSame(OBJETO1,OBJETO2);
	}
}
