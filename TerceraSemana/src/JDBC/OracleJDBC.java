package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBC {
	private static Connection connection;
	public final static String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public final static String URL = "jdbc:oracle:thin:@95.17.8.252:1521:xe";
	public final static String DATABASE = "";
	public final static String USUARIO = "hr";
	public final static String PASSWORD = "hr";

	public final static String SQL_LEER_TODOS = "Select * FROM Employees";
	public final static String SQL_LEER_COUNTRIES = "Select * FROM countries";

	public static void main(String[] args) throws SQLException {
		System.out.println("-----Oracle JDBC Connection Testing ----");
		/**
		 * Cargar driver
		 */
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your OracleJDBC Driver)?");
			e.printStackTrace();
			return;
		}
		System.out.println("Oracle JDBC Driver Registered!");
		/**
		 * Consigue conexion
		 */
		connection = null;
		try {
			connection = DriverManager.getConnection(URL + DATABASE, USUARIO, PASSWORD);

		} catch (SQLException e) {
			System.out.println("Connection Failed Check output console");
			e.printStackTrace();
			return;
		}
		lecturaEmployees();
		lecturaCountries();
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
			connection.close();
		} else {
			System.out.println("Failed to make connection!");
		}
	}

	public static void lecturaEmployees() throws SQLException {
		ResultSet rs = null;
		try {
			Statement stm = connection.createStatement();
			rs = stm.executeQuery(SQL_LEER_TODOS);
			while (rs.next()) {
				System.out.println(rs.getString("First_name") + " " + rs.getString("last_name"));
			}
		} catch (SQLException e) {
			System.out.println("SQL_LEER_TODOS" + " " + e.getMessage());
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
		}
	}
	public static void lecturaCountries() throws SQLException {
		ResultSet rs = null;
		try {
			Statement stm = connection.createStatement();
			rs = stm.executeQuery(SQL_LEER_COUNTRIES);
			while (rs.next()) {
				Country crt = new Country();
				crt.setCountry_id(rs.getString("country_id"));
				crt.setCountry_name(rs.getString("country_name"));
				crt.setRegion_id(rs.getString("region_id"));
				listarCtr(crt);
			}
		} catch (SQLException e) {
			System.out.println("SQL_LEER_TODOS" + " " + e.getMessage());
			e.printStackTrace();
		} finally {
			if (rs != null) {
				rs.close();
			}
		}
	}
	public static void listarCtr(Country ctr) {
		System.out.println(ctr.getCountry_id());
	}
}
