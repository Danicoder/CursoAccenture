package Implementacion;

import java.time.LocalDate;

public interface Filtros {
	/**
	 * Método que devuelve verdadero siempre que su longitud no sea mayor a 30
	 * @param texto
	 * @param longitud
	 * @return
	 */
	public boolean tMax(String texto, int longitud);
	/**
	 * Método que devuelve verdadero siempre que su longitud no sea menor a 20
	 * @param texto
	 * @param longitud
	 * @return
	 */
	public boolean tMin(String texto,int longitud);
	/**
	 * Controla la longitud del concepto y del titular de la cuenta
	 * @param texto
	 * @param maxLong
	 * @param minLong
	 * @return El rango entre 20 y 30
	 */
	public boolean cumpleRangoLongitud(String texto, int maxLong, int minLong);
	/**
	 * Método que devuelve verdadero siempre que la fecha sea menor a 5 años
	 * @param fecha
	 * @param fmax
	 * @return el año , siempre no sea mayor a 5 años
	 */
	public boolean fmax(LocalDate fecha,int fmax);
	/**
	 * Método que devuelve verdadero siempre que la fecha sea mayor a 3 años
	 * @param fecha
	 * @param fmin
	 * @return el año siempre que no sea mayor a 3 años
	 */
	public boolean fmin(LocalDate fecha,int fmin);
	/**
	 * Método que cumple con el rango de una fecha de entre 3 y 5 años
	 * @param fecha
	 * @param maxFecha
	 * @param minFecha
	 * @return la fecha siempre que no supere el rango
	 */
	public boolean fechaFiltro(LocalDate fecha, int maxFecha,int minFecha);
}
