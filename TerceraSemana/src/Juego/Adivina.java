package Juego;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un juego para adivinar un número , para ello obtenerlo 
 * aleatoriamente un número , y luego ir pidiendo al usuario los
 * números indicando sí es mayor o menor según sea mayor o menos
 * con respecto a N. El proceso termina cuando el usuario acuerte.
 * 
 * @author d.garcia.millan
 *
 */
public class Adivina {
	static int topeSub = 100;
	static int topeInf = 0;
	static int miNum = 20;
	
	public static void adivinaAdivinanza1() {
		int numero=(int)(Math.random()*100)+1;
		
		try (Scanner lectura = new Scanner (System.in)) {
			System.out.println("Ingrese el número a adivinar ");
			int numUser = lectura.nextInt();
			
			 do{
				if(numUser > numero)
					System.out.println(numUser + " es menor");
				else
					System.out.println(numUser + " es mayor");
				System.out.println("Ingrese número: ");
				numUser = lectura.nextInt();
			}while(numUser!=numero);
			 
			if(numUser == numero)
				System.out.println("Has acertado !!");
		}
	}
	public static void adivinaAdivinanza2() {
		int nRandom=(int)(Math.random()*100)+1;
		String numCadena= "";
		
		try (Scanner lectura = new Scanner (System.in)) {
			System.out.println("Ingrese el número a adivinar ");
			int numUser = lectura.nextInt();
			
			while(numUser != nRandom || numUser != miNum) {
				System.out.print("Némero:" + nRandom);
				if(numUser != miNum) {
					System.out.print("\t (M)ayor \\t (Me)nor \\t (f)in");
					numCadena = lectura.next();

					if(numCadena.equalsIgnoreCase("M") && ( numUser < miNum || numUser <  nRandom)) {
						System.out.println("Introduce un número: ");
						numUser = lectura.nextInt();
						if(numUser == nRandom || numUser == miNum) {
							System.out.println("Acertaste");
							break;
						}
					}
					else if(numCadena.equalsIgnoreCase("Me") && ( numUser > miNum || numUser >  nRandom)) {
						System.out.println("Introduce un número: ");
						numUser = lectura.nextInt();
						if(numUser == nRandom || numUser == miNum) {
							System.out.println("Acertaste");
							break;
						}
					}else if(numCadena.equalsIgnoreCase("f") && ( numUser < miNum || numUser <  nRandom)) {
						System.out.println("Gracias por participar, chao !!");
						break;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		adivinaAdivinanza1();
		adivinaAdivinanza2();
	}
}
	
