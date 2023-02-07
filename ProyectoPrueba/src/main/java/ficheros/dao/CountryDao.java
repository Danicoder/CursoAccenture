package ficheros.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ficheros.modelos.Country;
import ficheros.util.MontadorSQL;
import ficheros.util.OracleJDBC;

//Se comunica con la BD, Ejecuta ordenes
public class CountryDao implements ICountryDao {
	private Connection conn;
	public final String SQL_LEER_COUNTRIES = "Select * FROM countries";
	public final String SQL_LEER_COUNTRY_POR_ID = "Select * FROM countries where country_id = ";
	public final String SQL_LEER_COUNTRY_POR_ID2 = "Select * FROM countries where country_id = ?";
	public final String SQL_UPDATE_COUNTRY_DANIELA = "UPDATE COUNTRIES_DANI SET Country_id = ? , country_name = ?,region_id = ? WHERE country_id = ?";
	public final String SQL_INSERT_COUNTRY_DANIELA_CONTROLANDO = "INSERT INTO COUNTRIES_DANI Country_id , country_name ,region_id ";
	public final String SQL_DELETE_COUNTRY_DANIELA = "DELETE countries_DANI  WHERE country_id = ?";

	public CountryDao() throws SQLException {
		OracleJDBC ora = new OracleJDBC();
		conn = ora.abrir();// si es null devuelvo daoException
	}

	@Override
	public Country leerUno(String country_id) throws Exception {
		ResultSet rs = null;
		try {
			//Para cuando no se le pasa ?
//			Statement stm = conn.createStatement();
//			rs = stm.executeQuery(SQL_LEER_COUNTRY_POR_ID + "'" + country_id + "'");
			
			PreparedStatement ps = conn.prepareStatement(SQL_LEER_COUNTRY_POR_ID2);
			ps.setString(1, country_id);
			rs = ps.executeQuery();

			rs.next();//lee una únida id
			return carga(rs);
		} catch (SQLException e) {
			throw new Exception(SQL_LEER_COUNTRY_POR_ID + " " + e.getMessage());
		}
	}

	@Override
	public List<Country> leerTodos() throws Exception {
		ResultSet rs = null;
		List<Country> salida = new ArrayList<>();
		try {
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(SQL_LEER_COUNTRIES);// consigue una lista de punteros a registro resulset.
			while (rs.next()) {
				// conseguir un registro y convertirlo a country
				salida.add(carga(rs));
			}
		} catch (SQLException e) {
			throw new Exception(SQL_LEER_COUNTRIES + " " + e.getMessage());
		}
		return salida;
	}

//	@Override
//	public int actializar(Country country) throws Exception {
//		try {
//			PreparedStatement ps = conn.prepareStatement(SQL_UPDATE_COUNTRY_DANIELA);
//			ps.setString(1, country.getCountry_id());
//			ps.setString(2, country.getCountry_name());
//			ps.setString(3, country.getRegion_id());
//			ps.setString(4, country.getCountry_id());
//			return ps.executeUpdate();
//			
//		}catch (SQLException e) {
//			throw new Exception(SQL_LEER_COUNTRIES + " " + e.getMessage());
//		}
//	}
	@Override
	public int actializar(Country country) throws Exception {
		String sql = "UPDATE COUNTRIES_DANI SET" + montaSQL(country);
		sql += " where ";
		sql = MontadorSQL.addSalida(sql,"country_id",country.getCountry_id()," ");
		Statement stm = conn.createStatement();
		return stm.executeUpdate(sql); 
	}

	@Override
	public int delete(Country country) throws SQLException {
		PreparedStatement ps = conn.prepareStatement(SQL_DELETE_COUNTRY_DANIELA);
		ps.setString(1, country.getCountry_id());
		return ps.executeUpdate();
	}

	@Override
	public int delete(String country_id) throws SQLException {
		PreparedStatement ps = conn.prepareStatement(SQL_DELETE_COUNTRY_DANIELA);
		ps.setString(1, country_id);
		return ps.executeUpdate();
	}

	@Override
	public Country insert(Country country) throws SQLException {
		String sql = "INSERT INTO COUNTRIES_DANI" + montaSQL(country);
		Statement stm = conn.createStatement();
		return country;
	}

	public Country carga(ResultSet rs) throws SQLException {
		Country crt = new Country();
		crt.setCountry_id(rs.getString("country_id"));
		crt.setCountry_name(rs.getString("country_name"));
		crt.setRegion_id(rs.getString("region_id"));
		return crt;
	}
	public String montaSQL(Country country) {
		String salida ="";
		salida = MontadorSQL.addSalida(salida,"",country.getCountry_id(),",");
		salida = MontadorSQL.addSalida(salida,"",country.getCountry_name(),",");
		salida = MontadorSQL.addSalida(salida,"",country.getRegion_id(),",");
		return salida;
	}
	public String montaSQL_ConDatos(Country country) {
		String salida ="";
		salida = MontadorSQL.addSalida(salida,"country_id",country.getCountry_id(),",");
		salida = MontadorSQL.addSalida(salida,"country_name",country.getCountry_name(),",");
		salida = MontadorSQL.addSalida(salida,"region_id",country.getRegion_id(),",");
		return salida;
	}
}
