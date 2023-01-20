package curso.sintaxis;
/**
 * 
 * @author d.garcia.millan
 *
 */
public class ErroresCorregidos {

	static int $nombre;
	static int pasado; // no hace referencia a la variable de abajo
	static int alcance;// faltaba;
	/**
	 * Compruebo los errores que hay en la clase "Errores.class"
	 * @param arg
	 */
	public static void main(String[] arg) {
		int contador;
		contador = 25;
		$nombre = contador;
		pasado = contador;

		System.out.println($nombre + " / " + contador);
	}
}
