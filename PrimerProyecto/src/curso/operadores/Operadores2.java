package curso.operadores;
/**
 * 
 * @author Daniela García Millán
 *
 */
public class Operadores2 {
	/**
	 * Coloco la variable IVA como un valor que no se modifica
	 * y comienzo a calcular el valor qué se le podría asignar
	 * a cualquier artículo.
	 */
	private static final int IVA = 21;
	public static void main(String[] args) {
		int cantidad;
		int unidades;
		double precio;
		double importe;
		int Total;
		
		cantidad=3;
		unidades=12;
		precio=5.40;
		
		importe=(cantidad*unidades)*precio;
		double iva=importe*IVA/100;
		Total=(int) (importe + iva);
		
		System.out.println("cantidad\t"+cantidad);
		System.out.println("unidades\t"+unidades);
		System.out.println("precio\t"+precio);
		
		System.out.println("importe\t"+importe);
		System.out.println("Iva\t"+iva);
		System.out.println("Total\t"+Total+" debería ser: "+importe+iva);

	}
}
