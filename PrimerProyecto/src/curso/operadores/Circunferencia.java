package curso.operadores;
/**
 * 
 * @author Daniela García Millán
 *
 */
public class Circunferencia {
	static int radio = 23;
	/**
	 * Muestra en pantalla la longitud y el área de la circunferencia.
	 * @param args
	 */
	public static void main(String[] args) {
		double area;
		double longitud;

		longitud = 2 * Math.PI * radio;
		area = Math.PI * Math.pow(radio, 2);

		System.out.println("Longitud de la circunferencia\n cuyo radio es 23: \t" + longitud);
		System.out.println("Area de la circunferencia\n cuyo radio es 23:\t" + area);
	}

}