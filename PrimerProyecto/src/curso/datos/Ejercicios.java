package curso.datos;
/**
 * @author Daniela.garcia.millan
 */
public class Ejercicios {
	/**
	 * Imprime una serie de datos para prácticar
	 * los tipos de variables que existen en programación.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("HOLA MUNDO");
		System.out.println("Pruebas de tipos");
		char c='A';
		double precio=23.4;
		double iva=0.16;
		double importeTotal;
		importeTotal=precio*iva+precio;
		System.out.println("Caracter: "+c);
		System.out.println("Equivalencia Unicode: "+(int)c);
		System.out.println("Importe Total=:"+importeTotal);
		System.out.println("Primavera\nVerano\nOtoño\nInvierno");
		System.out.println("Lun\tMar\tMie\tJue\tVie");
		System.out.println("Lun\\Mar\\tMie\\tJue\\tVie");
		System.out.println("\"Cocodrilo\"");
		
	}

}
