package ficheros.dao;

import java.sql.SQLException;
import java.util.List;

import ficheros.modelos.Country;

public interface ICountryDao {
	
	public Country leerUno(String country_id) throws Exception;//no es auto numérico
	public List<Country> leerTodos() throws Exception;
	public int actializar(Country country) throws Exception;//update de country que devuelve country o las filas afectadas
	public int delete(Country country) throws SQLException;//paso el registro entero y lo borro
	public int delete(String country_id) throws SQLException; // eliminar un caso en concreto
	public Country insert(Country country) throws SQLException;
}
