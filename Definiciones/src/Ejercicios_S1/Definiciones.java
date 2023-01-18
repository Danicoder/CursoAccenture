package Ejercicios_S1;

import java.time.LocalTime;

/**
 * 
 * @author d.garcia.millan
 *Prueba de cómo definir los campos
 */
public class Definiciones {
	public static String nombre = "";
	/**
	 * Lanzamiento por consola
	 * @param args
	 */
	public static void main(String[] args) {
		
		Enlace ss = new Enlace();
		ss.modificacion();
		ss.url = "http://Holita.com";
		ss.hora = LocalTime.now();
		ss.modificacion();
		
		Enlace ss1 = new Enlace();
		ss1.modificacion();
		ss1.url = "http://Holita.com";
		ss1.hora = LocalTime.now();
		ss1.modificacion();
	}
}
