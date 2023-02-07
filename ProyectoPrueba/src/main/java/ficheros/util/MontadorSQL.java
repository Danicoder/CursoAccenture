package ficheros.util;

/**
 * @author d.garcia.millan
 */
public class MontadorSQL {
	/**
	 * Completar SQL añadiendo el nombre del campo y su valor Pensado para INSERT y
	 * UPDATES
	 * 
	 * @param salida
	 * @param nombreCampo
	 * @param valor
	 * @param separador
	 * @return
	 */
	public static String addSalida(String salida, String nombreCampo, int valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, "" + valor, separador);
	}

	public static String addSalida(String salida, String nombreCampo, double valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, "" + valor, separador);// ""+valor es una forma rápida de
																				// conversión a String
	}

	public static String addSalida(String salida, String nombreCampo, long valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, "" + valor, separador);
	}

	public static String addSalida(String salida, String nombreCampo, String valor, String separador) {
		return addSalidaSencilla(salida, nombreCampo, "'" + valor + "'", separador);
	}

	/**
	 * Recibe un String vacío que tiene que completar, El nombre del campo se añade
	 * solo sí es nulo, A continuación, se añade un signo "=" solo si se ha añadido
	 * nombre del campo por último añado el valor recibido
	 * 
	 * @param Parte     de la Strign ya construida
	 * @param Nombre    del campo que vamos a añadir
	 * @param valor     del campo
	 * @param separador que se tiene que añadir entre campos
	 * @return String que recibimos parcialmente construida a la que le vamos
	 *         añadiendo el nuevo campo
	 */
	public static String addSalidaSencilla(String salida, String nombreCampo, String valor, String separador) {
		 //segunda condición para el método montaSQL sin datos en el nombre del campo
		if (nombreCampo != null && nombreCampo.compareTo("") > 0) {
			salida += nombreCampo + "=";
		}
		else if (salida.length() > 0) {
			salida += " " + separador + " ";
		}
		salida += valor;
		return salida;
	}

}
