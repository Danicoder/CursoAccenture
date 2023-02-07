package rf.curso.S4_MiniApi2.controller;

import java.sql.SQLException;
import java.util.List;

import rf.curso.S4_MiniApi2.dao.CountryDao;
import rf.curso.S4_MiniApi2.modelos.Country;

//Recibe las escuchas y las redirije. Sabe de llamadas
public class CountryController {
	//Recibe orden de la pantalla
	CountryDao cDao;
	
	public CountryController() throws SQLException {
		cDao = new CountryDao();
	}
	public List<Country> leerTodos() throws Exception {
		return cDao.obtenerCountrys();
	}
	public Country leerUno(String country_id) throws Exception {
		return cDao.buscar(country_id);
	}
	public void actualizar(Country country) throws Exception {
		cDao.editar(country);
	}
	public void eliminar(Country country) throws SQLException {
		cDao.eliminar(country);
	}
	public void eliminar(String country_id) throws SQLException {
		cDao.eliminar(country_id);
	}
}