package Implementacion;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

/**
 * Clase que filtra por nombre y fecha
 * 
 * @author d.garcia.millan
 *
 */
public class Filtro implements Filtros {
	/**
	 * Método que devuelve verdadero siempre que su longitud no sea mayor a 30
	 * 
	 * @param texto
	 * @param longitud
	 * @return
	 */
	public boolean tMax(String texto, int longitud) {
		return texto.length() <= longitud;
	}

	/**
	 * Método que devuelve verdadero siempre que su longitud no sea menor a 20
	 * 
	 * @param texto
	 * @param longitud
	 * @return
	 */
	public boolean tMin(String texto, int longitud) {
		return texto.length() >= longitud;
	}

	/**
	 * Controla la longitud del concepto y del titular de la cuenta
	 * 
	 * @param texto
	 * @param maxLong
	 * @param minLong
	 * @return El rango entre 20 y 30
	 */
	public boolean cumpleRangoLongitud(String texto, int maxLong, int minLong) {
		return tMax(texto, maxLong) && tMin(texto, minLong);
	}

	/**
	 * Método que devuelve verdadero siempre que la fecha sea menor a 5 años
	 * 
	 * @param fecha
	 * @param fmax
	 * @return el año , siempre no sea mayor a 5 años
	 */
	public boolean fmax(LocalDate fecha, int fmax) {
		return fecha.getYear() < fmax;
	}

	/**
	 * Método que devuelve verdadero siempre que la fecha sea mayor a 3 años
	 * 
	 * @param fecha
	 * @param fmin
	 * @return el año siempre que no sea mayor a 3 años
	 */
	public boolean fmin(LocalDate fecha, int fmin) {
		return fecha.getYear() > fmin;
		// return fecha.isAfter(fmax); me obliga a poner en todos localDate
	}

	/**
	 * Método que cumple con el rango de una fecha de entre 3 y 5 años
	 * 
	 * @param fecha
	 * @param maxFecha
	 * @param minFecha
	 * @return la fecha siempre que no supere el rango
	 */
	public boolean fechaFiltro(LocalDate fecha, int maxFecha, int minFecha) {
		return fmax(fecha, maxFecha) && fmin(fecha, minFecha);
	}

	public LocalDate fechaCorrecta(String fecha){
		return fechaCorrecta(fecha,"dd/MM/YYYY");
	}

	public LocalDate fechaCorrecta(String fecha, String formato) {
		DateTimeFormatter formater = DateTimeFormatter.ofPattern(formato);
		try {
			return LocalDate.parse(fecha,formater);
		}catch(DateTimeParseException e) {}
		return null;
	}
}
