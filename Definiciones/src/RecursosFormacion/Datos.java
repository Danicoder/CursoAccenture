package RecursosFormacion;

public class Datos {
	static int dia = 10;
	static String nDni = "57433222";
	static double precio;
	static final boolean ACTIVO = true;
	
	public static void main(String[] arg) {	
		precio=135.12;
		System.out.println("Dia\t"+dia);
		System.out.println("Dni\t"+nDni);
		System.out.println("Precio\t"+precio);
		System.out.println("Activo\t"+ACTIVO);
	}
}
