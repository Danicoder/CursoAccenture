package Automovil;

public class AccesoBD {
	/**
	 * Reciben las subclases
	 */
	public void AccesoLectura(Dao Dao ) {
		/**
		 * Abre la BD
		 * Prepara SQL
		 * Ejecuta SQL
		 */
		Dao.leer();
		System.out.println("Leido");
	}
	public void AccesoGrabaciones(Dao Dao) {
		System.out.println("Grabando");
	}
}
