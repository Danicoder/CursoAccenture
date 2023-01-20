package curso.datos;
/**
 * @author d.garcia.millan
 */
public class Datos2 {
	private static int dia = 10;
	private static String nDni = "57433222";
	private static double precio;
	private static final boolean ACTIVO = true;
	/*
	 * Mismo ejercicio que el de datos.java, lo unico es que
	 * lo modificamos de tal forma que las variables puedan ser 
	 * vistas por cualquier método de la clase.
	 */
	public static void main(String[] arg) {	
		precio=135.12;
		System.out.println("Dia\t"+dia);
		System.out.println("Dni\t"+nDni);
		System.out.println("Precio\t"+precio);
		System.out.println("Activo\t"+ACTIVO);
	}
}
