package Juego.Adivina;

import java.util.Scanner;

/**
 * Realizar un juego para adivinar un número , para ello obtener aleatoriamente
 * un número ,luego ir pidiendo al usuario los números indicando sí es mayor o
 * menor o igual. El juego termina cuando el usuario acuerte.
 * 
 * @author d.garcia.millan
 *
 */
public class Adivina {
	static boolean finPartida;
	static int maquina = (int) (Math.random() * 1000) + 1;
	static int usuario = (int) (Math.random() * 1000) + 1;
	static int limInf = 0;
	static int limSup = 1000;
	static boolean acierto = false;

	static Scanner lectura = new Scanner(System.in);

	/**
	 * Método para que el usuario adivine un número aleatorio
	 */
	public static void adivinaAdivinanza1() {
		int numero = (int) ((Math.random() * 100) + 1);

		System.out.println("Ingrese el número a adivinar ");
		int numUser = lectura.nextInt();

		do {
			if (numUser > numero)
				System.out.println(numUser + " es menor");
			else if (numUser < numero) {
				System.out.println(numUser + " es mayor");
			}
			System.out.println("Ingrese número: ");
			numUser = lectura.nextInt();
		} while (numUser != numero);

		if (numUser == numero)
			System.out.println("Has acertado !!");
	}

	/**
	 * Método en el que es la máquina quien adivina el número que esta pensando el
	 * usuario
	 */
	public static void tiradaMaquina() {
		int resUsuairo = 0;
		do {

			System.out.print("El número que estas pensando es : " + maquina
					+ "\t 1 - Mayor \t 2 - Menor \t 3 - Acertaste maquina \t 3 - fin");
			resUsuairo = lectura.nextInt();

			switch (resUsuairo) {
			case 1:
				limInf = maquina;
				break;
			case 2:
				limSup = maquina;
				break;
			case 3:
				resUsuairo = maquina;
				break;
			case 4:
				System.out.println("Te gane !!");
			}
			maquina = ((limInf + limSup) / 2);
		} while (resUsuairo != maquina);
	}

	/**
	 * Método en el que el usuario adivina el número aleatorio que se le ha sido
	 * asignado. Una ves acierte el rol de adivinanza cambiará.
	 * 
	 * @param RespuestaUser
	 * @return
	 */
	public static boolean tiradaUsuario(int RespuestaUser) {

		if (RespuestaUser > usuario)
			System.out.println("es menor");
		else if (RespuestaUser < usuario) {
			System.out.println("es mayor");
		} else if (RespuestaUser == usuario) {
			System.out.println("Acertaste !!");
			acierto = true;
		}
		return acierto;
	}

	public static void main(String[] args) {
		// adivinaAdivinanza1();
		try {
			do {
				while (!acierto) {
					System.out.println("Ingrese el número a adivinar");
					int RespuestaUser = lectura.nextInt();
					tiradaUsuario(RespuestaUser);
				}
				tiradaMaquina();
			} while (finPartida);
			System.out.println("Gracias por participar, Chao !!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
