package Automovil;

public interface Dao {
	/**
	 * Recibe un objeto SQL y lo transforma en el correcto
	 */
	void leer();
	/**
	 * Coge la estructur y le da forma SQL
	 */
	void grabar();
}
