package curso.operadores;
/**
 * 
 * @author Daniela García Millán
 *
 */
public class Operadores1 {
	/**
	 * Predecimos antes de ejecutarlo el resultado final
	 * que se mostrará por pantalla para ver si acertamos.
	 * Una vez confirmado imprimimos el resultado para
	 * comprobar si estabamos en lo cierto.
	 * @param args
	 */
	public static void main(String[] args) {
		int valor=0;
		valor=23;
		valor+=10;
		System.out.println("Resultado a="+--valor);
		System.out.println("Resultado b="+--valor);
		System.out.println("Resultado c="+--valor);
		System.out.println("Resultado d="+--valor);
		System.out.println("Resultado e="+--valor);
	}

}
