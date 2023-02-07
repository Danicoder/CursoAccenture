package ficheros.controller;

import java.sql.SQLException;
import java.util.List;

import ficheros.dao.CountryDao;
import ficheros.dao.ICountryDao;
import ficheros.modelos.Country;
//Recibe las escuchas y las redirije. Sabe de llamadas
public class CountryController {
	//Recibe orden de la pantalla
	ICountryDao cDao;
	
	public CountryController() throws SQLException {
		cDao = new CountryDao();
	}
//	public void leerTodos() throws Exception {
//		List<Country> lc = cDao.leerTodos();
//	}
	public List<Country> leerTodos() throws Exception {
		return cDao.leerTodos();
	}
	public Country leerUno(String country_id) throws Exception {
		return cDao.leerUno(country_id);
	}
	public int actualizar(Country country) throws Exception {
		return cDao.actializar(country);
	}
	public int eliminar(Country country) throws SQLException {
		return cDao.delete(country);
	}
	public int eliminar(String country_id) throws SQLException {
		return cDao.delete(country_id);
	}
}
/**
 * El controlador habla con los clientes. Dirije cómo se deben de hacer las cosas
 * DAO sabe conectarse a la BD y la vista dialoga con un controlador
 */