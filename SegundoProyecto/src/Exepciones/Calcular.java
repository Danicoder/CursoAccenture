package Exepciones;

public class Calcular {
	public static void calcular() {
		int a = 0;
		int b = 300;
		int cociente =0;
		try {
			cociente = a / b;
			System.out.println("El ciente es: "+ cociente);
		} finally {
			System.out.println("El programa ha finalizado");
		}
	}
	/**
	 * No procesamos errror y lo procesamos al modulo llamador
	 * @throws ArithmeticException
	 */
	public static void calcular2() throws ArithmeticException{
		int a = 0;
		int b = 300;
		int cociente =0;
		try {
			cociente = b / a;
			System.out.println("El ciente es: "+ cociente);
		} finally {
			System.out.println("El programa ha finalizado");
		}
	}
	/**
	 * Lanza el error como Exception
	 * @throws Exception
	 */
	public static void calcular3() throws Exception{
		int a = 0;
		int b = 300;
		int cociente =0;
		try {
			cociente = b / a;
			System.out.println("El ciente es: "+ cociente);
		} finally {
			System.out.println("El programa ha finalizado");
		}
	}
	public static void main(String[] args) throws Exception {
		calcular();
		calcular2();
		calcular3();
	}

}
