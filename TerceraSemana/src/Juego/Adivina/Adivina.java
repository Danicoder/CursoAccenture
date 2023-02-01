package Juego.Adivina;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un juego para adivinar un número , para ello obtenerlo
 * aleatoriamente un número , y luego ir pidiendo al usuario los números
 * indicando sí es mayor o menor según sea mayor o menos con respecto a N. El
 * proceso termina cuando el usuario acuerte.
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
	static boolean ganamaquina;
	static boolean ganaUsuario;
	static int resUsuairo = 0;

	static Scanner lectura = new Scanner(System.in);

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

	public static void adivinaAdivinanza2() {
		while (finPartida == false) {
			try {
				if (ganamaquina == false) {
					tiradaMaquina();
				} else if (ganaUsuario == false) {
					tiradaUsuario();
				}
			} catch (Exception e) {
				e.getMessage();
				lectura.close();
			}
		}
	}

	public static void tiradaMaquina() {
		String respuesta = "";

		while (resUsuairo != maquina) {
			System.out.print("Número" + maquina + "\t (M)ayor \t (Me)nor \t (f)in");
			respuesta = lectura.next().toUpperCase();

			switch (respuesta) {
			case "M":
				maquina = limInf;
				break;
			case "Me":
				maquina = limSup;
				break;
			case "f":
				System.out.println("Te gane !!");
				ganamaquina = true;
				finPartida = true;
			}
		}
	}

	public static void tiradaUsuario() {
		System.out.println("Ingrese el número a adivinar ");
		resUsuairo = lectura.nextInt();

		if (resUsuairo > usuario)
			System.out.println(resUsuairo + " es menor");
		else if (resUsuairo < usuario) {
			System.out.println(resUsuairo + " es mayor");
		} else if (resUsuairo == usuario) {
			System.out.println("Acertaste !!");
			ganaUsuario = true;
			finPartida = true;
		}
	}

	public static void main(String[] args) {
		// adivinaAdivinanza1();
		adivinaAdivinanza2();
	}
}

