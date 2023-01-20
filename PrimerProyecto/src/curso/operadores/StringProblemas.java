package curso.operadores;
/**
 * 
 * @author Daniela García Millán
 *
 */

public class StringProblemas {
	/**
	 * Imprime la frase del argumento en consola de forma correcta
	 * @param args
	 */
	public static void frase(String[] args) {
	
		for(String frase: args) {
			System.out.print(frase+" ");
		}
	}
	/**
	 * Imprime la frase del argumento en consola del reves
	 * @param args
	 */
	public static void fraseAlreves(String[] args) {
		
		int longitud = args.length;
		while (longitud > 0) {
			String palabras = "";
			switch (palabras) {
			case "":
				System.out.print(args[longitud - 1] + " ");
				break;
			}
			longitud--;
		}
	}
	/**
	 * Imprime la frase del argumento en consola de forma correcta
	 * @param args
	 */
	public static void caracteresAlreves(String[] args) {
		String entrada = "";
		int lg = args.length;
		for (int a = 0; a < lg; a++) {
			entrada += args[a] + " ";
		}
		
		int longitud = entrada.length();
		int a;
		char caracter;
		int result = 0;
		for (a = longitud - 1; a >= 0; a--) {
			caracter= entrada.charAt(a);
			switch(caracter) {
				case 'a':
					result = 4;
					break;
				case 'e':
					result = 3;
					System.out.println(entrada.charAt(a)+result);
					break;
				case 'i':
					result = 1;
					break;
				case 'o':
					result = 0;
					break;
				case 'u':
					result = 9;
					break;
			}
			System.out.println(caracter+result);
			
		}
	}
	
	public static void main(String[] args) {
		frase(args);
		fraseAlreves(args);
		//caracteresAlreves(args);
	}
}
