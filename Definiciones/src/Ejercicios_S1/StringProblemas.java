package Ejercicios_S1;

import java.util.Iterator;

public class StringProblemas {
	public static void FraseAlreves(String[] args) {
	
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
	
	public static void CaracteresAlreves(String[] args) {
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
			System.out.println((char)caracter+result);
			
		}
	}
	
	public static void main(String[] args) {
		//FraseAlreves(args);
		CaracteresAlreves(args);
	}
}
