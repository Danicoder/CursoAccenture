package Implementacion;

import java.time.LocalDate;

/**
 * Nombre de titular > 20 y < 30
 * Fecha vto > 3 años < 5 años
 * Concepto textos ingresos y gastos
 * @author d.garcia.millan
 *
 */
public class Filtro {
	
	public static boolean tMax(String texto, int longitud) {
		return texto.length() <= longitud;
	}
	public static boolean tMin(String texto,int longitud) {
		return texto.length() >= longitud;
	}
	public static boolean cumpleRangoLongitud(String texto, int maxLong, int minLong) {
		return tMax(texto,maxLong) && tMin(texto,minLong);
	}
	public static boolean fmax(LocalDate fecha,int fmax) {
		return fecha.getYear() < fmax;
	}
	public static boolean fmin(LocalDate fecha,int fmin) {
		return fecha.getYear() > fmin;
		//return fecha.isAfter(fmax); me obliga a poner en todos localDate
	}
	public static boolean fechaFiltro(LocalDate fecha, int maxFecha,int minFecha) {
		return fmax(fecha,maxFecha) && fmin(fecha,minFecha);
	}
	
}
